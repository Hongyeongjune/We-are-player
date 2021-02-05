package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class ClubAlreadyExistException extends ErrorCodeException {
    public ClubAlreadyExistException(){
        this(ErrorCode.CLUB_DUPLICATION);
    }
    private ClubAlreadyExistException(ErrorCode errorCode) {
        super(errorCode);
    }
}
