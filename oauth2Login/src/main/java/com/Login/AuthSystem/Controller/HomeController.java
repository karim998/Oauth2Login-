package com.Login.AuthSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello Home Page";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello Secured";
    }
}
