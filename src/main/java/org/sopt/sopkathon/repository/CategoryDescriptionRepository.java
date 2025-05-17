package org.sopt.sopkathon.repository;

import java.util.Optional;

import org.sopt.sopkathon.domain.entity.CategoryDescriptionEntity;
import org.sopt.sopkathon.domain.entity.IslandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDescriptionRepository extends JpaRepository<CategoryDescriptionEntity, Long> {
	Optional<CategoryDescriptionEntity> findByIslandAndCategoryName(IslandEntity island, String category);
}
