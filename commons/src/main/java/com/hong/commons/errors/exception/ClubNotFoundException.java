package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class ClubNotFoundException extends ErrorCodeException {
    public ClubNotFoundException() {
        this(ErrorCode.CLUB_CANNOT_FOUND);
    }

    private ClubNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
