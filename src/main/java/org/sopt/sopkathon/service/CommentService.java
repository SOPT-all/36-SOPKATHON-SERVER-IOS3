package org.sopt.sopkathon.service;


import org.sopt.sopkathon.domain.Comment;
import org.sopt.sopkathon.domain.mapper.CommentMapper;
import org.sopt.sopkathon.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {


    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }



    List<Comment> allComments(){
        return commentRepository.findAll()
                .stream()
                .map(CommentMapper::toDomain).toList();
    }

}
