package com.wtt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${spring.user.name}")
    private String userName;
    @Value("${spring.user.age}")
    private int userAge;

    @GetMapping("/getUserInfo")
    public String getUserInfo() {
        System.out.println(this);
        System.out.println("" + this.userName + this.userAge);
        return this.userName + "-" + this.userAge;
    }
}
