package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @RequestMapping("/")

    public String printNumber() {
        int number = 1;
        int seventeen_Divisible = 0;
        int twenty_sevenDivisible = 0;
        int sevenDivisible = 0;
        String finalResult = "";
        String threeDivisible = "";
        String fiveDivisible = "";
        for (; number <= 100; number++) {
            if (number % 3 != 0 && number % 5 != 0) {
                System.out.println(number);
                finalResult += "<br/n>" + number;
            }
            if (number % 3 == 0) {
                System.out.println("Fizz");
                threeDivisible = "Fizz";
                finalResult += "<br/n>" + threeDivisible;
            }
            if (number % 5 == 0) {
                System.out.println("Buzz");
                fiveDivisible = "Buzz";
                finalResult += "<br/n>" + fiveDivisible;
            }
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
                finalResult += "<br/n>" + threeDivisible + fiveDivisible;
            }

            if (number % 7 == 0) {
                sevenDivisible++;
            }
            if (number % 17 == 0) {
                seventeen_Divisible++;
            }
            if (number % 27 == 0) {
                twenty_sevenDivisible++;
            }


        }
        System.out.println(sevenDivisible);
        System.out.println(seventeen_Divisible);
        System.out.println(twenty_sevenDivisible);
        return (finalResult + "<br/n>"+sevenDivisible+ "<br/n>"+ seventeen_Divisible+  "<br/n>"+twenty_sevenDivisible );
    }
}