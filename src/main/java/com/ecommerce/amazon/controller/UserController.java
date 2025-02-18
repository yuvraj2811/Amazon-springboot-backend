package com.ecommerce.amazon.controller;


import com.ecommerce.amazon.model.User;
import com.ecommerce.amazon.service.UserService;
import com.ecommerce.amazon.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    UserServiceImpl userService = new UserServiceImpl();

    @GetMapping("/getalluser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping()
    public String addUser(@RequestBody User user) {
        userService.creatUser(user);
        return  "Add Successfully";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable Long userId,@RequestBody User user){
        userService.updateUser(userId,user);
        return "Update Successfully";
    }

    @DeleteMapping("/{userId}")
    public String deletUser(@PathVariable Long userId){
        return "Detel Successfully";
    }

}