package com.yuzhou.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${env.name:config server not found}")
    private String name;

    @GetMapping("configClientTest")
    public String configClientTest() {
        return "hello,".concat(name);
    }
}
