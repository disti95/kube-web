package com.dittrich.kubeweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleService {

    @GetMapping("/hello")
    String hello() {
        return "hello";
    }

}
