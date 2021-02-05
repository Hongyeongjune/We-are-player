package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class InvalidInputValueException extends ErrorCodeException{
    public InvalidInputValueException(){
        super(ErrorCode.INVALID_INPUT_VALUE);
    }
    public InvalidInputValueException(ErrorCode errorCode) {
        super(errorCode);
    }
    public InvalidInputValueException(ErrorCode errorCode, String massage){
        this(errorCode);
    }

}
