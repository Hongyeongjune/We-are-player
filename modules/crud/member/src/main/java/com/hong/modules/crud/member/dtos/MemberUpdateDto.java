package com.hong.modules.crud.member.dtos;

import com.hong.commons.enums.DisclosureScopeState;
import com.hong.commons.enums.PositionType;
import com.hong.modules.crud.member.entitys.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberUpdateDto {
    private String id;
    private String city;
    private String district;
    private String pictureUri;
    private PositionType position;
    private int likeCnt;
    private int rudeCnt;
    private DisclosureScopeState disclosureScopeState;

    public MemberUpdateDto(Member member) {
        this.id = member.getId();
        this.city = member.getCity();
        this.district = member.getDistrict();
        this.pictureUri = member.getPictureUri();
        this.position = member.getPosition();
        this.likeCnt = member.getLikeCnt();
        this.rudeCnt = member.getRudeCnt();
        this.disclosureScopeState = member.getDisclosureScopeState();
    }
}
