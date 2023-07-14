package com.test.service;

import com.test.model.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//注册子模块名称
@FeignClient("service-provider")
public interface TestService {

    @GetMapping("/index/index")
    public Test getTest(@RequestParam("id") String id);
}
