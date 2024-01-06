package com.anys34.azalea.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column
    private String password;

    @Builder
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}

