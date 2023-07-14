package com.wtt.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/echo/{path}")
    String echoClient(@PathVariable(value = "path") String path);
}
