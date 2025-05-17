package org.sopt.sopkathon.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StepInfo {
    private final int totalStep;
    private final int remainStep;
    private final int islandCount;
}


