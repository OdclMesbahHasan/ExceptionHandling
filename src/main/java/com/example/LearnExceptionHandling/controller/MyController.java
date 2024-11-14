package com.example.LearnExceptionHandling.controller;

import com.example.LearnExceptionHandling.exceptions.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/throwException")
    public String throwException() {
        throw new CustomException("Custom Exception Thrown");
    }
}
