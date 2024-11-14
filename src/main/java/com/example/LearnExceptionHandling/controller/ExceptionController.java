package com.example.LearnExceptionHandling.controller;

import com.example.LearnExceptionHandling.exceptions.PlainTextException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ExceptionController {
    @GetMapping("/throww")
    public String exceptionThrow() {
        throw new PlainTextException("Throw controller based");
    }
}
