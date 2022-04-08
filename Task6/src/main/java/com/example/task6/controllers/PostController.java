package com.example.task6.controllers;

import com.example.task6.DTO.MyInputBody;
import com.example.task6.DTO.MyInfo;
import com.example.task6.DTO.MyOutBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ControllerAdvice
public class PostController {

    @PostMapping("/ache/{id}")
    public ResponseEntity<MyOutBody> postMethod(@RequestBody MyInputBody someBody, @PathVariable Integer id) {
        return new ResponseEntity<>(new MyOutBody(125.2, new MyInfo(someBody.getInfo().getDate(), id)), HttpStatus.OK);
    }
}
