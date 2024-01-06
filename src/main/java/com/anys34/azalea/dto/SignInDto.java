package com.anys34.azalea.dto;

import com.anys34.azalea.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignInDto {
    private String userId;
    private String name;
    private String password;

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .password(password)
                .build();
    }
}
