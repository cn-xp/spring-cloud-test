package com.wtt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/echo/{path}")
    public String echo(@PathVariable String path) {
        return "Hello " + path + ",port: " + this.port;
    }
}
