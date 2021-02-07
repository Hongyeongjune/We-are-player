package com.hong.modules.crud.member.service;

import com.hong.commons.errors.exception.MemberAlreadyExistException;
import com.hong.commons.errors.exception.MemberNotFoundException;
import com.hong.modules.crud.member.dtos.MemberSaveDto;
import com.hong.modules.crud.member.dtos.MemberUpdateDto;
import com.hong.modules.crud.member.entitys.Member;
import com.hong.modules.crud.member.repository.MemberCrudRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

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

    public Member find(String id) {
        return memberCrudRepository.findById(id)
                .orElseThrow(MemberNotFoundException::new);
    }

    public List<Member> findAll() {
        return memberCrudRepository.findAll();
    }

    public Member update(MemberUpdateDto dto) {
        Member member = memberCrudRepository.findById(dto.getId())
                .orElseThrow(MemberNotFoundException::new);

        return memberCrudRepository.save(member.updateInfo(dto));
    }

    public Member updatePassword(String id, String password) {
        Member member = memberCrudRepository.findById(id)
                .orElseThrow(MemberNotFoundException::new);

        return memberCrudRepository.save(member.updatePassword(password));
    }

    public void delete(String id) {
        Member member = memberCrudRepository.findById(id)
                .orElseThrow(MemberNotFoundException::new);

        memberCrudRepository.delete(member);
    }
}
