package com.duclong.thucung.controller;

import com.duclong.thucung.dto.request.NewUserRequest;
import com.duclong.thucung.entity.User;
import com.duclong.thucung.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody NewUserRequest request){
        return userService.createUser(request);
    }
    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }


}
