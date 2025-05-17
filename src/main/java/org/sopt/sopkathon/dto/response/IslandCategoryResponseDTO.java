package org.sopt.sopkathon.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record IslandCategoryResponseDTO(
	String name,

	@JsonProperty("island_id")
	Long id,

	@JsonProperty("island_description")
	String islandDescription,

	List<String> image,

	@JsonProperty("category_description")
	String categoryDescription
) {
}
