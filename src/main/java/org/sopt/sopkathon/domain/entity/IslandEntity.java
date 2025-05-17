package org.sopt.sopkathon.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class IslandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "island_id")
    private Long islandId;
}
