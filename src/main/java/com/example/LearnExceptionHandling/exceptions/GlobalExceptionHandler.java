package com.example.LearnExceptionHandling.exceptions;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(PlainTextException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public void handlePlainTextException(PlainTextException ex, HttpServletResponse response) throws IOException {
        // Log the exception and stack trace
        logger.error("PlainTextException occurred: {}", ex.getMessage(), ex);

        // Send the exception message along with the stack trace in the response
        response.setContentType(MediaType.TEXT_PLAIN_VALUE);
        response.getWriter().write(ex.getMessage());
        response.getWriter().write("\n\nStack Trace:\n");

        // Print the stack trace to the response body
        for (StackTraceElement element : ex.getStackTrace()) {
            response.getWriter().write(element.toString() + "\n");
        }
        response.getWriter().flush();
    }
}

