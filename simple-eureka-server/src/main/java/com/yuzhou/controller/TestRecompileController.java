package com.yuzhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestRecompileController {

    @RequestMapping("sayWord")
    public String sayWord(){
        String s = UUID.randomUUID().toString();
        s = "this test recompile!";
        return s;
    }
}
