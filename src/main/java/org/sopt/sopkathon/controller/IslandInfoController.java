package org.sopt.sopkathon.controller;

import org.sopt.sopkathon.dto.response.IslandCategoryResponseDTO;
import org.sopt.sopkathon.global.common.dto.ApiResponse;
import org.sopt.sopkathon.service.IslandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/islands")
@RequiredArgsConstructor
public class IslandInfoController {
	private final IslandService islandService;

	@GetMapping
	public ResponseEntity<ApiResponse<IslandCategoryResponseDTO>> getIslandByStepAndCategory(
		@RequestParam Long steps,
		@RequestParam String category
	) {
		IslandCategoryResponseDTO response = islandService.getIslandByStepsAndCategory(steps, category);
		return ResponseEntity
			.status(HttpStatus.OK)
			.body(ApiResponse.success(HttpStatus.OK, "요청이 성공했습니다.", response));

	}
}
