package com.techical.SpringMail.exception;


import com.techical.SpringMail.model.dto.ErrorModel;
import com.techical.SpringMail.model.dto.ResponseAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseAPI> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        List<ErrorModel> errorModelList = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errorModelList.add(ErrorModel.builder()
                            .fieldName(fieldName)
                            .errorMessage(errorMessage)
                    .build());
        });
        ResponseAPI response = ResponseAPI.builder()
                        .data(errorModelList).
                build();
        return new ResponseEntity<ResponseAPI>(response, HttpStatus.OK);
    }
}
