package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InEthio {
    @GetMapping ("/practice")
    public String Home(){
        return "Motherland";
    }
    @GetMapping("/inethiop")
    public String LastUpperCase(@RequestParam String Test,@RequestParam String Trying){
        return Test+" "+Trying;
    }
    @GetMapping("/wowmoment/{id}")
    public String OfMyLife (@PathVariable String id){
        return id;
    }
    @GetMapping ("/one")
    public String TryTry(){
        return "Proud";
    }
    @GetMapping ("/two")
    public String TryTwo (@RequestParam String Single){
        return Single;
    }
}
