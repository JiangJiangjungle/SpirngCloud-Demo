package com.jsj.springcloudfeignconsumer.service.rpc.fallback;

import com.jsj.springcloudfeignconsumer.service.rpc.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloServiceFallbackImpl implements HelloService {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "error : " + name;
    }

    @Override
    public String helloTimeout(@RequestParam("name") String name) {
        return "error : " + name;
    }
}
