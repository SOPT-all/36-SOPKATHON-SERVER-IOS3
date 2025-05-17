package org.sopt.sopkathon.controller;


import org.sopt.sopkathon.domain.mapper.CommentMapper;
import org.sopt.sopkathon.dto.response.CommentResponseDTO;
import org.sopt.sopkathon.global.common.dto.ApiResponse;
import org.sopt.sopkathon.global.common.dto.constant.SuccessCode;
import org.sopt.sopkathon.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/islands")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public ResponseEntity<ApiResponse<List<CommentResponseDTO>>> getComments() {

        List<CommentResponseDTO> commentResponseDTOList = commentService.getAllComments()
                .stream()
                .map(CommentMapper::toDto)
                .toList();

        return ResponseEntity.ok(ApiResponse.success(HttpStatus.OK,"성공",commentResponseDTOList));
    }

}
