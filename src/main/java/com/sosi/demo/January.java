package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class January {
    @GetMapping("/first")
    public String Month(){
        return "USA";
    }

    @GetMapping("/who")
    public String IsBestInstructor(){
        return "Gaurav";
    }
@GetMapping("/weekend")
    public String Restfull(){
        return "Day";
}
@GetMapping("/love")
    public String My(){
        return "Boys";
}
@GetMapping("/life")
    public String Is(){
        return"Beautiful";
}
@GetMapping("/eat")
    public String Healthy(){
        return"Food";
}
}
