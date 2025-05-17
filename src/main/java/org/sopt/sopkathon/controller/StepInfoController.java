package org.sopt.sopkathon.controller;
import org.sopt.sopkathon.domain.StepInfo;
import org.sopt.sopkathon.domain.mapper.StepInfoMapper;
import org.sopt.sopkathon.dto.response.CommentResponseDTO;
import org.sopt.sopkathon.dto.response.StepInfoResponseDTO;
import org.sopt.sopkathon.global.common.dto.ApiResponse;
import org.sopt.sopkathon.global.common.dto.constant.SuccessCode;
import org.sopt.sopkathon.service.StepInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/islands")
public class StepInfoController {


    private StepInfoService stepInfoService;

    public StepInfoController(StepInfoService stepInfoService){
        this.stepInfoService = stepInfoService;
    }
    @GetMapping("/steps/{userId}")
    public ResponseEntity<ApiResponse<StepInfoResponseDTO>> getStepInfos(@PathVariable Long userId){
        StepInfo stepInfo = stepInfoService.getStepInfo(userId);
        StepInfoResponseDTO stepInfoResponseDTO = StepInfoMapper.toDto(stepInfo); // mapper 메서드 사용
        return ResponseEntity.ok(ApiResponse.success(HttpStatus.OK,"성공", stepInfoResponseDTO));
    }

}



