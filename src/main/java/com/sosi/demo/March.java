package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class March {
    @GetMapping("/color")
    public String MyFav(){
        return "Green";
    }
    @GetMapping("/black")
    public String Always(){
        return "Beauty";
    }
    @GetMapping("/soccer")
    public String Boys(){
        return "Mom";
    }
    @GetMapping("/white")
    public String Car(){
        return"Toyota";
    }
    @GetMapping("/school")
    public String Bus(){
        return "Transportation";
    }
    @GetMapping("/beautiful")
    public String White(){
        return"Flower";
    }
    @GetMapping("/nice")
    public String Weather(){
        return"Summer";
    }
}
