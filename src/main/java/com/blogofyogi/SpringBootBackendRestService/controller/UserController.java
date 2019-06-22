package com.blogofyogi.SpringBootBackendRestService.controller;

import com.blogofyogi.SpringBootBackendRestService.model.User;
import com.blogofyogi.SpringBootBackendRestService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
       return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        userService.createUser(user);

        return user;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return userService.getUserById(user.getId());
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        userService.deleteUser(id);
        return user;
    }



}
