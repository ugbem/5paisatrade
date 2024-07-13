package com.emtek.com.ng.paisatrad.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AppController {

    @GetMapping("/home")
    public String goHome(){


        return "Welcome home!!!";
    }
    
}