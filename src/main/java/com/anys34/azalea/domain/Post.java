package com.anys34.azalea.domain;

import com.anys34.azalea.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column
    private String content;

    @Column
    private String title;

    @Column
    private Long hits;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}

