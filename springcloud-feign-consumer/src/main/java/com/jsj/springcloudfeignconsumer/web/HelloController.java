package com.jsj.springcloudfeignconsumer.web;


import com.jsj.springcloudfeignconsumer.service.rpc.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/1")
    public String hello(@RequestParam("name") String name) {
        log.info("-----------通过 FeignClient 调用 HelloService 的 hello 方法");
        return helloService.hello(name);
    }

    @GetMapping("/2")
    public String helloTimeout(@RequestParam("name") String name) {
        log.info("-----------通过 FeignClient 调用 HelloService 的 helloTimeout 方法");
        return helloService.helloTimeout(name);
    }
}
