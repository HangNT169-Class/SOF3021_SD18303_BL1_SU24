package com.poly.sof3021.B8_JPA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // => GET POST PUT DELETE
public class Category1Controller {

    @GetMapping("a11")
    public String test() {
        return "a";
    }
}
