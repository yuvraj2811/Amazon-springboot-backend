package com.ecommerce.amazon.controller;


import com.ecommerce.amazon.model.User;
import com.ecommerce.amazon.service.UserService;
import com.ecommerce.amazon.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
   // UserServiceImpl userService = new UserServiceImpl();
@Autowired
UserService userService;

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
        userService.deletUser(userId);
        return "Detel Successfully";
    }

    @GetMapping("name")
    public User getUserByName(@RequestParam String userName){
        return userService.getUserByName(userName);
    }

    @GetMapping("userMobile")
    public User getUserByMobile(String userMobile){
        return userService.getUserByMobile(userMobile);
    }
}