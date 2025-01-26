package com.test.javabasic.controller.user;

import com.test.javabasic.entity.user.UserEntity;
import com.test.javabasic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api")
public class UserCRUDController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/user/search")
    public UserEntity searchUserNameAndUserEmail(@RequestParam String userName, @RequestParam String userEmail) {
        return userService.findByUserNameAndUserEmail(userName, userEmail);
    }
}
