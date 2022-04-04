package com.example.task6.controllers;

import com.example.task6.DTO.MyBody;
import com.example.task6.DTO.MyInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@ControllerAdvice
public class EschoKakoitoController {

    @PostMapping("/ache/{id}")
    public ResponseEntity<MyBody> postMethod(@RequestBody MyBody someBody, @PathVariable Integer id) {
        return new ResponseEntity<>(new MyBody(125.2, new MyInfo(someBody.getInfo().getDate(), id)), HttpStatus.OK);
    }
}
