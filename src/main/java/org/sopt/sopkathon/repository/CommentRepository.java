package org.sopt.sopkathon.repository;

import org.sopt.sopkathon.domain.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
}
