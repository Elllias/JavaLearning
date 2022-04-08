package com.example.task6.controllers;

import com.example.task6.DTO.MyOut;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Arrays;
import java.util.Map;


@Controller
public class GetController {

    @GetMapping("/ache/{name}/{age}/{sex}")
    public ResponseEntity<MyOut> getMethod(@PathVariable String name, @PathVariable Integer age, @PathVariable String sex){
        return new ResponseEntity<>(new MyOut(name, age, sex), HttpStatus.OK);
    }

    @GetMapping("/ache")
    public String httpHeadersMethod(Model mod, @RequestHeader Map headers) {
        StringBuffer str = new StringBuffer("");

        headers.forEach((key, value) -> {
            str.append(String.format(" %s: %s \n", key, value));
        });

        mod.addAttribute("headers", str);
        return "MyTemp";
    }
}
