package org.sopt.sopkathon.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConroller {
    @GetMapping("/user")
    public String check() {
        return "Server is running!";
    }
}
