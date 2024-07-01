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
@GetMapping("/wekkend")
    public String Sunday(){
        return "FunDay";
}
@GetMapping("/monday")
    public String FirstDay(){
        return "OfTheWeek";
}
@GetMapping("/tuesday")
    public String SecondDay(){
        return"OfWork";
}
@GetMapping("/wensday")
    public String ThirdDay(){
        return"MidWeek";
}
@GetMapping("/thursady")
    public String ForthDay(){
        return"CloseToEndWeek";
}
@GetMapping("/friday")
    public String FifthDay(){
        return"AlmostWeekend";
}
@GetMapping("/saturday")
    public String SixthDay(){
        return"OfficialWeekend";
}
@GetMapping("/sunday")
    public String ChurchAnd(){
        return"FunDay";
}
}
