package com.anys34.azalea.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "post_hashtag")
public class PostHashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "hashtag_id")
    private Hashtag hashtag;
}
