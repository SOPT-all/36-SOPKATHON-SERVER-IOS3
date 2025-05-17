package org.sopt.sopkathon.domain.mapper;

import org.sopt.sopkathon.domain.Comment;
import org.sopt.sopkathon.domain.StepInfo;
import org.sopt.sopkathon.domain.entity.StepInfoEntity;
import org.sopt.sopkathon.dto.response.CommentResponseDTO;
import org.sopt.sopkathon.dto.response.StepInfoResponseDTO;

public class StepInfoMapper {
    public static StepInfo toDomain(StepInfoEntity stepInfoEntity){
        return new StepInfo(
                stepInfoEntity.getTotalStep(),
                stepInfoEntity.getRemainStep(),
                stepInfoEntity.getTotalStep()

        );
    }

    public static StepInfoResponseDTO toDto(StepInfo stepInfo) {
        return new StepInfoResponseDTO(
                stepInfo.getTotalStep(),
                stepInfo.getRemainStep(),
                stepInfo.getIslandCount()
        );
    }
}

