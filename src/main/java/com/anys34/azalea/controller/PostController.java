package com.anys34.azalea.controller;

import com.anys34.azalea.Service.PostService;
import com.anys34.azalea.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @PostMapping("/create")
    public void createPost(@RequestBody PostDto postDTO) {
        postService.createPost(postDTO);
    }
}

