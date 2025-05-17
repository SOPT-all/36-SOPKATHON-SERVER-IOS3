package org.sopt.sopkathon.domain.mapper;

import org.sopt.sopkathon.domain.StepInfo;
import org.sopt.sopkathon.domain.entity.StepInfoEntity;

public class StepInfoMapper {
    public static StepInfo toDomain(StepInfoEntity stepInfoEntity){
        return new StepInfo(
                stepInfoEntity.getTotalStep(),
                stepInfoEntity.getRemainStep(),
                stepInfoEntity.getTotalStep()

        );
    }
}

