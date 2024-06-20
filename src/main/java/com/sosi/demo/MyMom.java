package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyMom {
//Thank You God!

    private Map<Long,Entry>Entrys=new HashMap<>();
    @GetMapping ("/getall")
    public List<Entry> Talemnat(){
        return new ArrayList<>(Entrys.values());
    }
    @PostMapping("/addall")
    public String createntry(@RequestBody Entry myentry){
        Entrys.put(myentry.getId(), myentry);
        return "Thank G";
    }
}
