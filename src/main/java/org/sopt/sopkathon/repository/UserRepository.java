package org.sopt.sopkathon.repository;

import org.sopt.sopkathon.domain.User;
import org.sopt.sopkathon.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}