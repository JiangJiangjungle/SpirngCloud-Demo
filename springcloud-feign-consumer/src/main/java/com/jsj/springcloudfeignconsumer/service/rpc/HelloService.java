package com.jsj.springcloudfeignconsumer.service.rpc;

import com.jsj.springcloudfeignconsumer.service.rpc.fallback.HelloServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 利用Feign调用HelloService
 *
 * @author jsj
 * @date 2019-03-31
 */
@FeignClient(value = "serviceA", fallback = HelloServiceFallbackImpl.class)
public interface HelloService {

    @GetMapping("/1")
    String hello(@RequestParam("name") String name);

    @GetMapping("/2")
    String helloTimeout(@RequestParam("name") String name);
}
