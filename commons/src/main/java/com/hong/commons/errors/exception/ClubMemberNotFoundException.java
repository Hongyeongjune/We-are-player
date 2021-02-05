package com.hong.commons.errors.exception;


import com.hong.commons.errors.ErrorCode;

public class ClubMemberNotFoundException extends ErrorCodeException {
    public ClubMemberNotFoundException(){
        this(ErrorCode.MEMBER_CANNOT_FOUND_IN_CLUB);
    }

    private ClubMemberNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
