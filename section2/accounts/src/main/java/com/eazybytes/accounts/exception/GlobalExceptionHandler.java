package com.eazybytes.accounts.exception;

import com.eazybytes.accounts.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

// 모든 컨트롤러에서 발생하는 예외를 처리하기 위한 전역 예외 처리기
@ControllerAdvice
public class GlobalExceptionHandler {

    // 특정 예외를 처리하는 메서드
    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(
            CustomerAlreadyExistsException exception, WebRequest webRequest){
        // ErrorResponseDto 객체를 생성하여 클라이언트에 반환할 에러 정보를 설정합니다.
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                webRequest.getDescription(false), // 요청에 대한 설명을 포함합니다.
                HttpStatus.BAD_REQUEST,           // HTTP 상태 코드를 BAD_REQUEST (400)로 설정합니다.
                exception.getMessage(),           // 발생한 예외의 메시지를 포함합니다.
                LocalDateTime.now()               // 현재 시각을 포함하여 에러 발생 시점을 기록합니다.
        );

        // 생성된 ErrorResponseDto 객체를 ResponseEntity로 감싸서 반환합니다.
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(
            ResourceNotFoundException exception, WebRequest webRequest){
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                webRequest.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }

}
