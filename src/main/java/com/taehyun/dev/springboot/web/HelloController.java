package com.taehyun.dev.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
public class HelloController {

    @GetMapping("/hello")   // 2. HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
    public String hello() {
        return "Hello.";
    }
}
