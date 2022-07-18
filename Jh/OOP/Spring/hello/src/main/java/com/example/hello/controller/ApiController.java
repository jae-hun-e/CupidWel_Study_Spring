package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 class는 REST API를 처리하는 Controller
@RequestMapping ("/api") // RequestMapping URL 를 저장해주는 Annotation
public class ApiController {

    @GetMapping("/hello") //http://localhost:9090/api/hello
    public String hello(){
        return "hello CupidWel";
    }
}
