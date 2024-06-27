package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class October {
    @GetMapping("/my")
    public String Born(){
        return "Month";
    }
    @GetMapping("/november")
    public String Special(){
        return "My Ezraye";
    }
    @GetMapping("/march")
    public String Best(){
        return"My Bemneye";
    }
    @GetMapping("/september")
    public String Geneye(){
        return "My Sister";
    }
    @GetMapping("/may")
    public String Talem(){
        return "Yene Enat";
    }
    @GetMapping("/january")
    public String Jemaneye(){
        return "Yene Abat";
    }
    @GetMapping("/april")
    public String Start(){
        return "Grace";
    }
}
