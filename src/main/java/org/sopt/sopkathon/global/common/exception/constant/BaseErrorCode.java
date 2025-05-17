package org.sopt.sopkathon.global.common.exception.constant;

import org.springframework.http.HttpStatus;

public interface BaseErrorCode {
	HttpStatus getStatus();
	int getCode();
	String getMessage();
}
