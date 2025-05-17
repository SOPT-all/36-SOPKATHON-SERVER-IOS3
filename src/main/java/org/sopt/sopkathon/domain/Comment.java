package org.sopt.sopkathon.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Comment {
    private Long commentId;
    private Long islandId;
    private String content;
}
