package com.yuzhou.producer;

import com.yuzhou.hystrix.ServiceHiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-hi-client",fallback = ServiceHiHystrix.class)
public interface ServiceHiProducer {

    @GetMapping("serviceHiTest")
    String getServiceHi();
}
