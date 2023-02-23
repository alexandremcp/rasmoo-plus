package com.client.ws.rasmooplus.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.client.ws.rasmooplus.dto.error.ErrorResponseDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;

@RestControllerAdvice
public class ResourceHandler {
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponseDto> notFoundException(NotFoundException n) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponseDto.builder()
                .message(n.getMessage())
                .httpStatus(HttpStatus.NOT_FOUND)
                .statusCode(HttpStatus.NOT_FOUND.value())
                .build());
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponseDto> badRequestException(BadRequestException b) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDto.builder()
            .message(b.getMessage())
            .httpStatus(HttpStatus.BAD_REQUEST)
            .statusCode(HttpStatus.BAD_REQUEST.value())
            .build());
    }

    
}


/*
 * NotFoundException
 * *****************
 * Este código é um controlador de exceções que lida com uma exceção específica chamada NotFoundException. 
 * Quando uma exceção NotFoundException é lançada em algum ponto do código da aplicação, 
 * o controlador de exceções captura essa exceção e trata ela de uma forma personalizada, 
 * retornando uma resposta HTTP com um código de status 404 (NOT_FOUND) e uma mensagem de erro personalizada para o cliente.
 * 
 * O controlador de exceções é implementado na classe ResourceHandler, que está anotada com @RestControllerAdvice. 
 * Essa anotação indica que a classe é um controlador de exceções global que pode lidar com exceções de toda a aplicação.
 * 
 * O método notFoundException() é anotado com @ExceptionHandler e é responsável por lidar com a exceção NotFoundException.
 * Ele recebe um objeto NotFoundException como parâmetro e extrai a mensagem de erro da exceção usando o método getMessage().
 * Em seguida, ele retorna um objeto ResponseEntity que contém a mensagem de erro e um código de status HTTP 404 (NOT_FOUND).
 * 
 */