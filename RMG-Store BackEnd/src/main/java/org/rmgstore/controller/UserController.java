package org.rmgstore.controller;

import org.rmgstore.model.User;
import org.rmgstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        return userService.login(user);
    }
    @GetMapping("/save")
    public String save(@RequestBody User user){
        User user1 = userService.save(user);
        if(user1!=null)
            return "User created Successfully";
        return "User not created";
    }
}
