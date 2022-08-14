package com.cognizant.pms.processPension.exception;

import com.cognizant.pms.processPension.apiResponse.ApiResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ProcessPensionExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProcessPensionException.class)
    public ResponseEntity<ApiResponse> somethingWentWrong(ProcessPensionException ex) {
        return ResponseEntity.ok(ApiResponse.builder()
                        .status(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(ex.getMessage())
                .build());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
        return ResponseEntity.ok(ApiResponse.builder()
                        .status(HttpStatus.BAD_REQUEST.value())
                        .message("Invalid Input")
                        .data(errors)
                .build());
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
                                                                         HttpHeaders headers, HttpStatus status, WebRequest request) {
        return ResponseEntity.ok(ApiResponse.builder().status(status.value())
                .message(ex.getMessage()).build());
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .status(status.value())
                        .message("Required request body is missing").build());

    }
}
