package com.anys34.azalea.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class UserInfoDto implements Serializable {
    private String userId;

    @Builder
    public UserInfoDto(String userId) {
        this.userId = userId;
    }
}
