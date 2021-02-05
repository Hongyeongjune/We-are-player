package com.hong.commons.errors.exception;

import com.hong.commons.errors.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorCodeException extends RuntimeException {
    private final ErrorCode errorCode;
}
