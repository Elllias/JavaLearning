package com.example.task10.CONTROLLER;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class MainController {

    @GetMapping("/public/api")
    public String getHelloPage(){
        return "<h2>Hello, WebWanderer!</h2>";
    }

    @GetMapping("/admin/api")
    public String getUserPage(Authentication auth){
        var role = auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList())
                .get(0)
                .split("_")[1];
        var name = auth.getName();
        return "<h2>Hello, " + name + "!</h2>\n<h2>Your roles: " + role + "</h2>";
    }

    @GetMapping("/support/api")
    public String getAdminPage(Authentication auth){
        var role = auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList())
                .get(0)
                .split("_")[1];;
        var name = auth.getName();
        return "<h2>Hello, " + name + "!</h2>\n<h2>Your roles: " + role + "</h2>";
    }
}
