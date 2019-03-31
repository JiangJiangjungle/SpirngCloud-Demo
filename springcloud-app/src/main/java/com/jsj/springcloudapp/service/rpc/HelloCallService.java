package com.jsj.springcloudapp.service.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 利用Feign调用HelloService
 *
 * @author jsj
 * @date 2019-03-31
 */
@FeignClient("app")
public interface HelloCallService {

    @GetMapping("/s")
    String callHello(@RequestParam("name") String name);
}
