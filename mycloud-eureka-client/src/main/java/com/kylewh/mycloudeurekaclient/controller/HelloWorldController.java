package com.kylewh.mycloudeurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylewhao
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/hi")
    public String hi(){
        return "Hello World";
    }
}
