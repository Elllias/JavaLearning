package com.example.task9.controllers;

import com.example.task9.annotation.TargetAnnotation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Service
public class MainController {
    @TargetAnnotation
    @GetMapping("/search")
    public ResponseEntity<String> getController() {
        return new ResponseEntity<>("Ответ на запрос успешно получен!", HttpStatus.OK);
    }
}
