package com.hong.modules.crud.member.dtos;

import com.hong.commons.enums.DisclosureScopeState;
import com.hong.commons.enums.MemberType;
import com.hong.commons.enums.PositionType;
import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class MemberSaveDto {
    private String id;
    private String password;
    private String name;
    private String city;
    private String district;
    private String pictureUri;
    private PositionType position;
    private MemberType type;
    private DisclosureScopeState disclosureScopeState;
}
