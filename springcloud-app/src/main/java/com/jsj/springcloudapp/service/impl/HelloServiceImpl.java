package com.jsj.springcloudapp.service.impl;

import com.jsj.springcloudapp.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * HelloService实现
 *
 * @author jsj
 * @date 2019-03-31
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String helloTimeout(String name) {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException i){
            i.printStackTrace();
        }
        return "Hello! " + name;
    }
}
