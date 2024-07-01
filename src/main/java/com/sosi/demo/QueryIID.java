package com.sosi.demo;

import org.springframework.validation.support.BindingAwareConcurrentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryIID {
    @GetMapping("/news")
    public String Perfect(@RequestParam String One){
        return One;
    }
    @GetMapping("/simple/{id}")
    public String Getid(@PathVariable String id){
        return id;
    }
    @GetMapping("/query-api")
    public String GetMethode(@RequestParam String GiveSomeInput){
        return GiveSomeInput;
    }
    @GetMapping("/my-query-api")
    public String AnotherGetMethode(@RequestParam String GivinOutCome){
        return GivinOutCome;
    }
    @GetMapping("/api-for-queryparam")
    public String TimeToTimeMethode(@RequestParam String FirstQueryParam,@RequestParam String SecondQueryParam){
        return FirstQueryParam+" "+SecondQueryParam;
    }
    @GetMapping("/express-api-queryparam")
    public String SpecialMethod(@RequestParam String AmericaExpCard,@RequestParam String NewCreditCard){
        return AmericaExpCard+" "+NewCreditCard;
    }


}



