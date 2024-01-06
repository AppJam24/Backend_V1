package com.anys34.azalea.Service;

import com.anys34.azalea.Repository.HashtagRepository;
import com.anys34.azalea.Repository.PostRepository;
import com.anys34.azalea.domain.Hashtag;
import com.anys34.azalea.domain.Post;
import com.anys34.azalea.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;
    private final HashtagRepository hashtagRepository;

    public void createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());

        List<Hashtag> hashtags = new ArrayList<>();
        for (String hashtagName : postDto.getHashtags()) {
            Hashtag existingHashtag = hashtagRepository.findByName(hashtagName);
            if (existingHashtag == null) {
                Hashtag newHashtag = new Hashtag();
                newHashtag.setName(hashtagName);
                existingHashtag = hashtagRepository.save(newHashtag);
            }
            hashtags.add(existingHashtag);
        }

        post.setHashtags(hashtags);

        postRepository.save(post);
    }
}

