package com.test.controller;

import com.test.model.Test;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    TestService testService;

    @GetMapping("/index")
    public Test getTest(String id) {
        return this.testService.getTest(id);
    }
}
