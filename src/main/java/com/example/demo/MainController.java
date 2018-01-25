package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @RequestMapping("/")

    public String printNumber(){
        int number=0;
        String finalResult="";
        String threeDivisible="";
        String fiveDivisible="";
        for(;number<=100;number++){
            System.out.println(number);
finalResult+="<br/n>"+number;
            if(number%3==0){
                System.out.println("Fizz");
           threeDivisible="Fizz";
                finalResult+="<br/n>"+threeDivisible; }
            if(number%5==0){
                System.out.println("Buzz");
            fiveDivisible="Buzz";
                finalResult+="<br/n>"+fiveDivisible;}
            if (number%3==0 && number%5==0){
                System.out.println("FizzBuzz");
                finalResult+="<br/n>"+threeDivisible +fiveDivisible; ;
            }
        }
        return ( finalResult);
    }
}
