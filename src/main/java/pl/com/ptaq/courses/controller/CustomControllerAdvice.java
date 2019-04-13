package pl.com.ptaq.courses.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.com.ptaq.courses.exceptions.ReksioNotAllowedException;

@RestControllerAdvice
public class CustomControllerAdvice {

    @ExceptionHandler
    public String handle(Exception ex){
        return "Coś poszło nie tak.\nA mianowicie:\n" + ex.getMessage();
    }

    @ExceptionHandler
    public String reksioHandler (ReksioNotAllowedException rex){
        return "Reksio jest niedozwolony";
    }

}
