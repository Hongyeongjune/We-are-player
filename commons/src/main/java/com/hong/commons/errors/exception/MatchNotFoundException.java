package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class MatchNotFoundException extends ErrorCodeException {
    public MatchNotFoundException(){
        this(ErrorCode.MATCH_NOT_FOUND);
    }
    private MatchNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
