package com.anys34.azalea.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class PostDto {
    private String title;
    private String content;
    private List<String> hashtags;
}
