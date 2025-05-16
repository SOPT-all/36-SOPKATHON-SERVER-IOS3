package org.sopt.sopkathon.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;



}
