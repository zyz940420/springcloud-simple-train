package com.yuzhou.hystrix;

import com.yuzhou.producer.ServiceHiProducer;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements ServiceHiProducer {

    @Override
    public String getServiceHi() {
        return "feign hystrix test success";
    }
}
