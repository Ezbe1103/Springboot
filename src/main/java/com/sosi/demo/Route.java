package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Route {

    @GetMapping("/Soccer")
        public String MyBoys(){
        return "The Best Players";
    }






}


