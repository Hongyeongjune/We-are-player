package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class AuthorizationException extends ErrorCodeException {
    public AuthorizationException(){
        this(ErrorCode.AUTHORIZATION);
    }
    public AuthorizationException(ErrorCode errorCode){
        super(errorCode);
    }
}
