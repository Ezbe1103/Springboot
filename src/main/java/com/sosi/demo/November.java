package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class November {
    @GetMapping("/god")
    public String Grateful(){
        return "Thank You";
    }
    @GetMapping("/milk")
    public String Cold(){
        return "Cow";
    }
    @GetMapping("/honey")
    public String Bee(){
        return "Sweet";
    }
    @GetMapping("/meet")
    public String Cow(){
        return "Beef";
    }
    @GetMapping("/vegetables")
    public String Salad(){
        return "Kale";
    }
    @GetMapping("/drink")
    public String Clean(){
        return "Water";
    }
    @GetMapping("/brown")
    public String Bread(){
       return "Healthy";
    }
}
