package org.sopt.sopkathon.service;

import jakarta.validation.constraints.Max;
import org.sopt.sopkathon.domain.StepInfo;
import org.sopt.sopkathon.domain.entity.StepInfoEntity;
import org.sopt.sopkathon.domain.mapper.StepInfoMapper;
import org.sopt.sopkathon.dto.response.StepInfoResponseDTO;
import org.sopt.sopkathon.repository.StepInfoRepository;
import org.springframework.stereotype.Service;


@Service
public class StepInfoService {

    private StepInfoRepository stepInfoRepository;

    public StepInfoService(StepInfoRepository stepInfoRepository) {
        this.stepInfoRepository = stepInfoRepository;
    }
    public StepInfo getStepInfo(Long userId) {
        return stepInfoRepository.findById(userId)
                .map(StepInfoMapper::toDomain)
                .orElseThrow(() -> new IllegalArgumentException("해당 유저의 StepInfo가 존재하지 않습니다."));
    }

    public void updateStepInfo(Long userId,int step){
        StepInfoEntity stepInfoEntity = stepInfoRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("해당 유저의 StepInfo가 존재하지 않습니다."));

        int updatedTotalStep = stepInfoEntity.getTotalStep();
        int updatedRemainStep = Math.max(0,stepInfoEntity.getRemainStep() - step);
        int updatedIslandCount = stepInfoEntity.getIslandCount() + 1;

          stepInfoEntity.updateStepInfo(updatedTotalStep,updatedRemainStep,updatedIslandCount);
    }
}
