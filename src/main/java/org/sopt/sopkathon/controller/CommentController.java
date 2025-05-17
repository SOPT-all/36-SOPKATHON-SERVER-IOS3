package org.sopt.sopkathon.controller;


import org.sopt.sopkathon.domain.mapper.CommentMapper;
import org.sopt.sopkathon.dto.request.CommentRequest;
import org.sopt.sopkathon.dto.response.CommentResponseDTO;
import org.sopt.sopkathon.global.common.dto.ApiResponse;
import org.sopt.sopkathon.global.common.dto.constant.SuccessCode;
import org.sopt.sopkathon.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/islands")

public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("/comments/{islandId}")
    public ResponseEntity<ApiResponse<List<CommentResponseDTO>>> getComments(
        @PathVariable Long islandId
    ) {

        List<CommentResponseDTO> commentResponseDTOList = commentService.getAllComments(islandId)
                .stream()
                .map(CommentMapper::toDto)
                .toList();

        return ResponseEntity.ok(ApiResponse.success(HttpStatus.OK,"성공",commentResponseDTOList));
    }

    @PostMapping("/{islandId}/comments")
    public ResponseEntity<ApiResponse<Void>> createComment(
        @PathVariable Long islandId,
        @RequestBody final CommentRequest request
    ) {
        commentService.createComment(islandId, request);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(ApiResponse.success(HttpStatus.CREATED, "요청이 성공했습니다.", null));
    }

}
