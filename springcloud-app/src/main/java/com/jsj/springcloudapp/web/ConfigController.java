package com.jsj.springcloudapp.web;

import com.jsj.springcloudapp.config.TestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    TestConfiguration testConfiguration;

    @GetMapping("")
    public String hello() {
        return testConfiguration.getValue();
    }
}
