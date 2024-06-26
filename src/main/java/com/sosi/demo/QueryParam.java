package com.sosi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParam {
    @GetMapping("/practice")
    public String New (@RequestParam String Code,@RequestParam String Style){
        return Code + " "+Style;
    }
    @GetMapping("/two")
    public String Practice2 (@RequestParam String Wall,@RequestParam String Paint){
        return Wall +" "+Paint;

    }
    @GetMapping("/three")
    public String Practice3 (@RequestParam String Roof,@RequestParam String Top){
        return Roof +" "+Top;
    }
    @GetMapping("/threett")
    public String Practice4 (@RequestParam String Play,@RequestParam String Ground){
        return Play+" "+Ground;
    }
    @GetMapping("/four")
    public String Practice5 (@RequestParam String Saturday,@RequestParam String Morning){
        return Saturday+" "+Morning;
    }
    @GetMapping("/five")
    public String Practice6 (@RequestParam String Ilove,@RequestParam String Myboys){
        return Ilove+" "+Myboys;
    }
    @GetMapping("/six")
    public String Practice7 (@RequestParam String Inside,@RequestParam String Out){
        return Inside+" "+Out;
    }
    @GetMapping("/seven")
    public String Practice8 (@RequestParam String Etalem,@RequestParam String Jemaneye){
        return Etalem+" "+Jemaneye;
    }
    @GetMapping("/eight")
    public String Practice9 (@RequestParam String Sisters,@RequestParam String Brothers){
        return Sisters+" "+Brothers;
    }
    @GetMapping("/nine")
    public String Practice10 (@RequestParam String Family,@RequestParam String First){
        return Family+" "+First;
    }
    @GetMapping("/ten")
    public String Practice11 (@RequestParam String Making,@RequestParam String Sence){
        return Making+" "+Sence;
    }
    @GetMapping("/eleven")
    public String Practice12 (@RequestParam String Mylucky,@RequestParam String Numbers){
        return Mylucky+" "+Numbers;
    }

}
