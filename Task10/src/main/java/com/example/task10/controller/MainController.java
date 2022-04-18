package com.example.task10.controller;

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
        return String.format("<h2>Hello, %s!</h2>\n<h2>Your roles: %s</h2>", role, name);
    }

    @GetMapping("/support/api")
    public String getAdminPage(Authentication auth){
        var role = auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList())
                .get(0)
                .split("_")[1];;
        var name = auth.getName();
        return String.format("<h2>Hello, %s!</h2>\n<h2>Your roles: %s</h2>", role, name);
    }
}
