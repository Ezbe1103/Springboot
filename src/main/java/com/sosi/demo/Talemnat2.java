package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Talemnat2 {
    @GetMapping("/test/?MyMom=Talem")
    public String Ezbe() {
        return "Hello World";
    }
//Gaurav is the best
    //Code is used Get Api

    @GetMapping("/talemnat")
    public String Sosena() {
        return "Thank You God ";
    }


    @GetMapping("/getpeople")
    public String Talemnat() {
        return "Alekaye Mike ";
    }
    @GetMapping("/mymom")  
    public String Talem() {
        String Jemaneye="Talemnat ";
        String Ezraye= "Bemneye";
        return Jemaneye+Ezraye;
    }
}
