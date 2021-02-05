package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;

public class InvitationNotFoundException extends ErrorCodeException{

    public InvitationNotFoundException(){
        this(ErrorCode.INVITATION_NOT_FOUND);
    }
    public InvitationNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
