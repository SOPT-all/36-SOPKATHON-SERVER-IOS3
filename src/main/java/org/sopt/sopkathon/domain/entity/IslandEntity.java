package org.sopt.sopkathon.domain.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Island")
public class IslandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "island_id")
    private Long islandId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "island_description", nullable = false)
    private String islandDescription;

    @Column(name = "image")
    private String image;

}



