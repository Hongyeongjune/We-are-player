package com.hong.modules.crud.member.dtos;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class MemberPasswordUpdateDto {
    private String id;
    private String newPassword;
}
