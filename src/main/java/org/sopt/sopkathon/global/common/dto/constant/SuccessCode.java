package org.sopt.sopkathon.global.common.dto.constant;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum SuccessCode {
	OK(HttpStatus.OK, "s2000", "요청이 성공했습니다."),
	CREATED(HttpStatus.CREATED, "s2010", "요청이 성공했습니다.");

	private final HttpStatus status;
	private final String code;
	private final String message;

	SuccessCode(HttpStatus status, String code, String message) {
		this.status = status;
		this.code = code;
		this.message = message;
	}

}
