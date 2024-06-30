package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetID {
    @GetMapping("/getid1/{id}")
    public String Getid(@PathVariable String id){
        return id;
    } @GetMapping("/getid2/{id}")
    public String GetidA(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid3/{id}")
    public String GetidB(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid4/{id}")
    public String GetidC(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid5/{id}")
    public String GetidD(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid6/{id}")
    public String GetidE(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid7/{id}")
    public String GetidF(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid8/{id}")
    public String GetidG(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid9/{id}")
    public String GetidH(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid10/{id}")
    public String GetidI(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid11/{id}")
    public String GetidJ(@PathVariable String id){
        return id;
    }
    @GetMapping("/getid12/{id}")
    public String GetidS(@PathVariable String id){
        return id;
    }
}
