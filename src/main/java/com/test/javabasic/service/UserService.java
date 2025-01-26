package com.test.javabasic.service;

import com.test.javabasic.entity.user.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
}
