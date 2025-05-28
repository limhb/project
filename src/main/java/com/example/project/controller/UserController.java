package com.example.project.controller;

import com.example.project.service.UserService;
import com.example.project.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users/join")
    public UserVO insertUser(@ModelAttribute UserVO user) {
        return userService.insertUser(user);
    }

    @PostMapping("/users/login")
    public UserVO login(@RequestBody UserVO user) {
        return userService.login(user);
    }

    @GetMapping("/users")
    public List<UserVO> getUsers(UserVO user) {
        return userService.getUserList(user);
    }

    @GetMapping("/users/{uiNum}")
    public UserVO getUser(@PathVariable("uiNum") int uiNum) {
        return userService.getUser(uiNum);
    }

//    @PutMapping("/users/{uiNum}")
//    public int updateUser(@PathVariable int uiNum, @RequestBody UserVO user) {
//        user.setUiNum(uiNum);
//        return userService.updateUser(user);
//    }
//
//    @DeleteMapping("/users/{uiNum}")
//    public int deleteUser(@PathVariable int uiNum) {
//        return userService.deleteUser(uiNum);
//    }
}
