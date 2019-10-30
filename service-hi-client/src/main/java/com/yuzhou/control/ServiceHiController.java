package com.yuzhou.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceHiController {

    @GetMapping("serviceHiTest")
    public String serviceHiTest(){
        return "ServiceHi Test Success";
    }
}
