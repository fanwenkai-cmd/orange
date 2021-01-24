package com.qianfeng.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class DemoController {
    @Value("${foo}")
    private String foo;
//    @Value("${server.port}")
//    private String serverPort;
    @Value("${user.name}")
    private String username;

    @GetMapping("/hello")
    public String hello(){
        return "Hello"+username+",foo = " +foo ;
    }
}
