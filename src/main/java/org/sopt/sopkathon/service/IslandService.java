package org.sopt.sopkathon.service;

import java.util.List;

import org.sopt.sopkathon.domain.entity.CategoryDescriptionEntity;
import org.sopt.sopkathon.domain.entity.IslandEntity;
import org.sopt.sopkathon.dto.response.IslandCategoryResponseDTO;
import org.sopt.sopkathon.global.common.exception.CustomException;
import org.sopt.sopkathon.global.common.exception.constant.ExceptionCode;
import org.sopt.sopkathon.repository.CategoryDescriptionRepository;
import org.sopt.sopkathon.repository.IslandRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IslandService {

	private final IslandRepository islandRepository;
	private final CategoryDescriptionRepository categoryDescriptionRepository;

	public IslandCategoryResponseDTO getIslandByStepsAndCategory(Long steps, String category) {
		int index = (int)((steps - 1) / 50);

		List<IslandEntity> islands = islandRepository.findAllByOrderByIslandIdAsc();
		if (index >= islands.size()) {
			throw new CustomException(ExceptionCode.ISLAND_NOT_FOUND);
		}

		IslandEntity island = islands.get(index);

		CategoryDescriptionEntity categoryDescription = categoryDescriptionRepository
			.findByIslandAndCategoryName(island, category)
			.orElseThrow(() -> new CustomException(ExceptionCode.INVALID_CATEGORY));

		return new IslandCategoryResponseDTO(
			island.getName(),
			island.getIslandId(),
			island.getIslandDescription(),
			island.getImages(),
			categoryDescription.getDescription()
		);
	}
}
