package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;
import lombok.Getter;

@Getter
public class AccessDeniedAuthenticationException extends ErrorCodeException{
    public AccessDeniedAuthenticationException() {

        this(ErrorCode.HANDLE_ACCESS_DENIED);
    }

    private AccessDeniedAuthenticationException(ErrorCode errorCode) {

        super(errorCode);
    }
}
