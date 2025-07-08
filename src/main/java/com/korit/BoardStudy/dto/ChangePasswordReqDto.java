package com.korit.BoardStudy.dto;


import com.korit.BoardStudy.security.model.PrincipalUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
@Data
@AllArgsConstructor
public class ChangePasswordReqDto {
    private Integer userId;
    private String oldPassword;
    private String newPassword;

    public User toEntity(BCryptPasswordEncoder bCryptPasswordEncoder) {
        return.log
    }
}
