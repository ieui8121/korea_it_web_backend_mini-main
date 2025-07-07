package com.korit.BoardStudy.service;


import com.korit.BoardStudy.dto.ApiRespDto;
import com.korit.BoardStudy.entity.User;
import com.korit.BoardStudy.oauth2.OAuth2MergeReqDtq;
import com.korit.BoardStudy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OAuth24AuthService {

    @Autowired
    private UserRepository userRepository;


    
}
