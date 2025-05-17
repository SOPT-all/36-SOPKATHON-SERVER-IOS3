package org.sopt.sopkathon.repository;

import java.util.List;

import org.sopt.sopkathon.domain.entity.IslandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IslandRepository extends JpaRepository<IslandEntity, Long> {
	List<IslandEntity> findAllByOrderByIslandIdAsc();
}
