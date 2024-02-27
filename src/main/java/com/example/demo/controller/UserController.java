package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    // @RequestMapping (value = "/api/user", method = RequestMethod.GET)
    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @DeleteMapping("/{id}")
    public UserDto deleteById(@PathVariable  String id) {
        return userService.deleteUserById(id);
    }


    @PostMapping("")
    public String createUser(@RequestBody @Valid User user){
          return userService.createUser(user);
    }

    @PutMapping("")
    public String updateUser(@RequestBody @Valid User user){
        return userService.updateUser(user);
    }



}
