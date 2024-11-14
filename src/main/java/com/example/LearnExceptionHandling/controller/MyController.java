package com.example.LearnExceptionHandling.controller;

import com.example.LearnExceptionHandling.exceptions.CustomException;
import com.example.LearnExceptionHandling.exceptions.PlainTextException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/throwException")
    public String throwException() {
        throw new PlainTextException("Plain text Exception");
       // throw new CustomException("Server not found");
    }

    @GetMapping("/abc")
    public String abc() {
        throw new PlainTextException("Abc thrown");
    }

}
