package com.boot.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.home.service.UserService;

@RestController 
public class HomeController {

    
    private final UserService userService;

    @Autowired 
    HomeController(UserService userService){
        this.userService = userService;
    }

    @GetMapping ("/dashboard")
    public  String getHome () {
        return userService.getAdminData();
        //return "Welcome to the secure area";
    }

}
