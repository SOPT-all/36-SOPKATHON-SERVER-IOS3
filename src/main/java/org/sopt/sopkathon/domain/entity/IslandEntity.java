package org.sopt.sopkathon.domain.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "image1", nullable = false)
    private String image1;

    @Column(name = "image2", nullable = false)
    private String image2;

    @Column(name = "image3", nullable = false)
    private String image3;

    public List<String> getImages() {
        return List.of(image1, image2, image3);
    }

}