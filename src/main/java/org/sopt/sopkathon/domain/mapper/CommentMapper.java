package org.sopt.sopkathon.domain.mapper;

import org.sopt.sopkathon.domain.Comment;
import org.sopt.sopkathon.domain.StepInfo;
import org.sopt.sopkathon.domain.entity.CommentEntity;
import org.sopt.sopkathon.domain.entity.StepInfoEntity;

public class CommentMapper {
    public static Comment toDomain(CommentEntity commentEntity){
        return new Comment(
                commentEntity.getCommentId(),
                commentEntity.getIslandEntity().getIslandId(),
                commentEntity.getComment()

        );
    }
}
