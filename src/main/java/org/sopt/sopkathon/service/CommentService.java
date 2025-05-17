package org.sopt.sopkathon.service;


import org.sopt.sopkathon.domain.Comment;
import org.sopt.sopkathon.domain.entity.CommentEntity;
import org.sopt.sopkathon.domain.entity.IslandEntity;
import org.sopt.sopkathon.domain.mapper.CommentMapper;
import org.sopt.sopkathon.dto.request.CommentRequest;
import org.sopt.sopkathon.global.common.exception.CustomException;
import org.sopt.sopkathon.global.common.exception.constant.ExceptionCode;
import org.sopt.sopkathon.repository.CommentRepository;
import org.sopt.sopkathon.repository.IslandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CommentService {
    private final IslandRepository islandRepository;
    private final CommentRepository commentRepository;

    public List<Comment> getAllComments(
        Long islandId
    ){
        IslandEntity islandEntity = islandRepository.findById(islandId).orElseThrow();

        return commentRepository.findAllByIslandEntity(islandEntity).stream().map(CommentMapper::toDomain).toList();
    }

    public void createComment(Long islandId, CommentRequest request) {

        log.info(islandId + "asdfsadf");

        IslandEntity island = islandRepository.findById(islandId)
            .orElseThrow(() -> new CustomException(ExceptionCode.ISLAND_NOT_FOUND));

        CommentEntity comment = new CommentEntity(island, request.comment());
        commentRepository.save(comment);
    }

}
