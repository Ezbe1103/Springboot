package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// USED FOR TO PERFORM REST API
public class Talemnat2 {// MAIN CLASS
    @GetMapping("/test/?MyMom=Talem")// GET API/METHODES
    public String Ezbe() {// FUNCTION
        return "Hello World";//RESPONSE
    }
//Gaurav is the best 
    //Code is used Get Api

    @GetMapping("/talemnat")
    public String Sosena() {
        return "Thank You God ";
    }
// Gaurav is the best teacher in the whole world!

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
