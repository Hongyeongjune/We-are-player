package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class SubmitNotFoundException extends ErrorCodeException {

    public SubmitNotFoundException(){
        this(ErrorCode.SUBMIT_NOT_FOUND);
    }
    public SubmitNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
