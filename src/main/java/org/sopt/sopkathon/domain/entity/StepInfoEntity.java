package org.sopt.sopkathon.domain.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sopt.sopkathon.domain.User;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "step_info")
public class StepInfoEntity {

    @Id
    private Long userId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private int totalStep;
    private int remainStep;
    private int islandCount;


    public void updateStepInfo(int totalStep,int remainStep,int islandCount){
        this.totalStep = totalStep;
        this.remainStep = remainStep;
        this.islandCount = islandCount;
    }
}


