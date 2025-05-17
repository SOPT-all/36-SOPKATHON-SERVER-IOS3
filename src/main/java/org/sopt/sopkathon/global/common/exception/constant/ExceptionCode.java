package org.sopt.sopkathon.global.common.exception.constant;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ExceptionCode implements BaseErrorCode{

	// 공통
	INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,500, "서버 내부 오류입니다."),

	// 섬 조회 관련
	ISLAND_NOT_FOUND(HttpStatus.NOT_FOUND,404, "해당 섬이 없습니다."),
	INVALID_CATEGORY(HttpStatus.NOT_FOUND,404, "유효한 카테고리가 아닙니다.");

	private final HttpStatus status;
	private final int code;
	private final String message;

	@Override
	public HttpStatus getStatus() {
		return status;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
