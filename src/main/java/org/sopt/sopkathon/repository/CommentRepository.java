package org.sopt.sopkathon.repository;

import java.util.List;

import org.sopt.sopkathon.domain.entity.CommentEntity;
import org.sopt.sopkathon.domain.entity.IslandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
	List<CommentEntity> findAllByIslandEntity(IslandEntity island);
}
