package com.hong.modules.aws.s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
public class S3Uploader {

    private final String bucket;
    private final AmazonS3 amazonS3;

    public String upload(MultipartFile multipartFile, String dirName, String fileName) throws IOException {
        File uploadFile = convert(multipartFile)
                .orElseThrow(() -> new IllegalArgumentException("MultipartFile -> File로 전환이 실패하였습니다."));

        return upload(uploadFile, dirName, fileName);
    }

    public String upload(File uploadFile, String dirName, String fileName) {
        String fullName = dirName + "/" + fileName;
        String uploadImageUrl = putS3(uploadFile, fullName);
        removeNewFile(uploadFile);
        return uploadImageUrl;
    }

    private void removeNewFile(File targetFile) {
        if(targetFile.delete()) {
            log.info("File Delete Success");
        } else {
            log.info("File Delete fail");
        }
    }

    private String putS3(File uploadFile, String fileName) {
        amazonS3.putObject(new PutObjectRequest(bucket, fileName, uploadFile).withCannedAcl(CannedAccessControlList.PublicRead));
        return amazonS3.getUrl(bucket, fileName).toString();
    }

    private Optional<File> convert(MultipartFile file) throws IOException {

        if(file == null) {
            ClassPathResource pathResource = new ClassPathResource("person.png");
            return Optional.of(pathResource.getFile());
        }

        File convertFile = new File(file.getOriginalFilename());
        if(convertFile.createNewFile()) {
            try(FileOutputStream fos = new FileOutputStream(convertFile)) {
                fos.write(file.getBytes());
            }
            return Optional.of(convertFile);
        }
        return Optional.empty();
    }
}
