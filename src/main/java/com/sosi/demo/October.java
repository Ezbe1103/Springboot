package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String Jemaneye(@RequestParam String test, @RequestParam String test2 ){
        return test+" "+test2;
    }

    @GetMapping("/april")
    public String Start(@RequestParam String var1, @RequestParam String var2){
        return var1 + " "+var2;
    }

    @GetMapping("/december")
    public String Last(@RequestParam String Last, @RequestParam String Month){
        return Last + " "+Month;
    }

    @GetMapping("/getid/{id}")
    public String GetId(@PathVariable String id){
        return id;
    }




}
