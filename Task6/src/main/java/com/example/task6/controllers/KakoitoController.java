package com.example.task6.controllers;

import com.example.task6.DTO.MyOut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class KakoitoController {

    @GetMapping("/ache/{name}/{age}/{sex}")
    public ResponseEntity<MyOut> getMethod(@PathVariable String name, @PathVariable Integer age, @PathVariable String sex){
        return new ResponseEntity<>(new MyOut(name, age, sex), HttpStatus.OK);
    }
}
