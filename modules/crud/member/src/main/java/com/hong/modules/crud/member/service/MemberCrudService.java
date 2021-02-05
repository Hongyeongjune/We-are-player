package com.hong.modules.crud.member.service;

import com.hong.commons.errors.exception.MemberAlreadyExistException;
import com.hong.modules.crud.member.dtos.MemberSaveDto;
import com.hong.modules.crud.member.entitys.Member;
import com.hong.modules.crud.member.repository.MemberCrudRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberCrudService {

    private final MemberCrudRepository memberCrudRepository;

    public Member save(MemberSaveDto dto) {

        if(memberCrudRepository.existsById(dto.getId()))
            throw new MemberAlreadyExistException();

        Member member = Member.builder()
                .id(dto.getId())
                .password(dto.getPassword())
                .name(dto.getName())
                .roleSet(dto.getType().getRoles())
                .city(dto.getCity())
                .district(dto.getDistrict())
                .pictureUri(dto.getPictureUri())
                .position(dto.getPosition())
                .build();

        return memberCrudRepository.save(member);

    }
}
