package com.ecommerce.amazon.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandeler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ErrorResponse handelProductNotFoundExcepiton(Exception exception) {
        ErrorResponse errorResponse = new ErrorResponse() {
            @Override
            public HttpStatusCode getStatusCode() {
                return HttpStatusCode.valueOf(200);
            }

            @Override
            public ProblemDetail getBody() {
                return  ProblemDetail.forStatusAndDetail(getStatusCode(),exception.getMessage());
            }
        };
        return errorResponse;
    }


    @ExceptionHandler(Exception.class)
    public String handelGenricException(Exception exception) {
        return exception.getMessage();
    }
}