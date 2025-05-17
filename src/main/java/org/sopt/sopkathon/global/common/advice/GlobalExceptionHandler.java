package org.sopt.sopkathon.global.common.advice;

import org.sopt.sopkathon.global.common.dto.ApiResponse;
import org.sopt.sopkathon.global.common.exception.CustomException;
import org.sopt.sopkathon.global.common.exception.constant.BaseErrorCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ApiResponse<Void>> handleCustomException(CustomException e) {
		return createErrorResponse(e.getErrorCode());
	}

	private ResponseEntity<ApiResponse<Void>> createErrorResponse(BaseErrorCode errorCode) {
		return ResponseEntity
			.status(errorCode.getStatus())
			.body(ApiResponse.error(errorCode.getStatus(), errorCode.getMessage()));
	}
}
