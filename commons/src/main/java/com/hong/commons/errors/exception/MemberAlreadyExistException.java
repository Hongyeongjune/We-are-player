package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class MemberAlreadyExistException extends ErrorCodeException {
    public MemberAlreadyExistException() {
        this(ErrorCode.EMAIL_DUPLICATION);
    }

    private MemberAlreadyExistException(ErrorCode errorCode) {
        super(errorCode);
    }
}
