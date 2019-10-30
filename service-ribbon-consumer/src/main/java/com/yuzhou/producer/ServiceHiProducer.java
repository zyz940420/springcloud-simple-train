package com.yuzhou.producer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceHiProducer {

    private static RestTemplate restTemplate = new RestTemplate();

    private static final String URL = "http://localhost:8763/serviceHiTest";

    @HystrixCommand(fallbackMethod = "hystrixTest")
    public String getServiceHi() {
        return restTemplate.getForObject(URL, String.class);
    }

    private String hystrixTest() {
        return "Hystrix Test Success";
    }
}
