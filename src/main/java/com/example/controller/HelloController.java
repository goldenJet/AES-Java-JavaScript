package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jet on 2017/6/2.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String helloController1(){
        return "welcome";
    }

    @RequestMapping("/aes1")
    public String helloController2(){
        return "aes_key";
    }
    @RequestMapping("/aes2")
    public String helloController3(){
        return "aes_key_iv";
    }

}
