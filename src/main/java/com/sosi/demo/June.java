package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class June {
    @GetMapping("/moment")
    public String Life(){
        return "Start";
    }
    @GetMapping("/new")
    public  String One(){
        return "Again";
    }
    @GetMapping("/two")
    public  String Five(){
        return "Try";
    }

}
