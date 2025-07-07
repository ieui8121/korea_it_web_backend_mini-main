package com.korit.BoardStudy.oauth2;


import com.korit.BoardStudy.entity.OAuth2User;
import lombok.Data;

@Data
public class OAuth2MergeReqDtq {
    private String username;
    private String password;
    private String provider;
    private String providerUserId;

    public OAuth2User toOAuth2User(Integer userId) {
        return OAuth2User.builder()
                .userId(userId)
                .provider(provider)
                .providerUserId(providerUserId)
                .build();
    }
}
