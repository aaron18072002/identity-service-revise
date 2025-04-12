package com.coding.identity_service_revise.controller;

import com.coding.identity_service_revise.dto.request.UserCreationRequest;
import com.coding.identity_service_revise.dto.request.UserUpdateRequest;
import com.coding.identity_service_revise.entity.User;
import com.coding.identity_service_revise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody UserCreationRequest request) {
        return this.userService.createUser(request);
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId) {
        return this.userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
        return this.userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        this.userService.deleteUser(userId);

        return "User has been deleted";
    }

}
