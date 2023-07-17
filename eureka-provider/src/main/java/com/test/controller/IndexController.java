package com.test.controller;

import com.test.model.Test;
import com.test.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    TestServiceImpl testService;

    @GetMapping("/index")
    public Test getTest(String id) {
        return this.testService.getTest(id);
    }

    @GetMapping("/timeout")
    public String timeout()  {
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
