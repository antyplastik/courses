package pl.com.ptaq.courses.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class CustomControllerAdvice {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handle(Exception ex){
        return "Smuteczek... Coś poszło nie tak i było buuummm!";
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String validatorException(MethodArgumentNotValidException ex){
        BindingResult br = ex.getBindingResult();
        List<ObjectError> errors = br.getAllErrors();
        return "Not valid argument\n" + errors.get(0).getDefaultMessage();
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String reksioHandler (ReksioNotAllowedException rex){
        return "Reksio jest niedozwolony";
    }

}
