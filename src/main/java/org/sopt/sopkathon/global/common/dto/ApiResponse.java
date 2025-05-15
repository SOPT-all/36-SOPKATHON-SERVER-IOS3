package org.sopt.sopkathon.global.common.dto;

import org.sopt.sopkathon.global.common.dto.constant.SuccessCode;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
	private String code;
	private String message;
	private T data;

	public static<T> ApiResponse<T> success(SuccessCode successCode, T data) {
		return new ApiResponse<>(successCode.getCode(), successCode.getMessage(), data);
	}

	public static<T> ApiResponse<T> success(SuccessCode successCode) {
		return new ApiResponse<>(successCode.getCode(), successCode.getMessage(), null);
	}


}
