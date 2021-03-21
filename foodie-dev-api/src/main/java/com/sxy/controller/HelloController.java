package com.sxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: raintor
 * @Date: 2021/3/21 21:28
 * @Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return "hello";
    }
}
