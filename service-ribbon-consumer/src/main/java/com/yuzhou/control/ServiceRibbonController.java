package com.yuzhou.control;

import com.yuzhou.producer.ServiceHiProducer;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRibbonController {

    @Autowired
    ServiceHiProducer serviceHiProducer;

    @RequestMapping("serviceRibbonTest")
    public String serviceRibbonTest() {
        String result = serviceHiProducer.getServiceHi();

        return StringUtils.isNotBlank(result) ? result : "Get Service-Hi Error";

    }

}
