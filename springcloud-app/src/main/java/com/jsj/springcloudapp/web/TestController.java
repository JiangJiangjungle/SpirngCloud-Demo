package com.jsj.springcloudapp.web;

import com.jsj.springcloudapp.service.rpc.HelloCallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HelloCallService helloCallService;

    @GetMapping("/s")
    public String hello(@RequestParam("name") String name) {
        log.info("-----------通过 FeignClient封装的HelloCallService 调用 HelloService");
        return helloCallService.callHello(name);
    }
}
