package com.jsj.springcloudapp.web;

import com.jsj.springcloudapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/1")
    public String hello(@RequestParam("name") String name) {
        return helloService.hello(name);
    }

    @GetMapping("/2")
    public String helloTimeout(@RequestParam("name") String name) {
        return helloService.helloTimeout(name);
    }

}
