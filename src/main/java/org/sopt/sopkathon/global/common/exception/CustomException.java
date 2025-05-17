package org.sopt.sopkathon.global.common.exception;

import org.sopt.sopkathon.global.common.exception.constant.BaseErrorCode;

public class CustomException extends RuntimeException {

	private final BaseErrorCode errorCode;

	public CustomException(BaseErrorCode errorCode) {
		errorCode.getMessage();
		this.errorCode = errorCode;
	}

	public BaseErrorCode getErrorCode() {return errorCode;}

}
