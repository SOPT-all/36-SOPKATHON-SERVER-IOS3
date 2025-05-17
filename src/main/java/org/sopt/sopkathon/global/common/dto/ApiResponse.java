package org.sopt.sopkathon.global.common.dto;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
	private HttpStatus code;
	private String message;
	private T data;

	public static <T> ApiResponse<T> success(HttpStatus statusCode, String message, T data) {
		return new ApiResponse<>(statusCode, message, data);
	}

	public static <T> ApiResponse<T> error(HttpStatus statusCode, String message) {
		return new ApiResponse<>(statusCode, message, null);
	}
}