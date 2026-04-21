package com.simple_interest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService calService;

    public CalculatorController(CalculatorService calService) {
        this.calService = calService;
    }

    @GetMapping("/simple-interest")
    public double calculateSimpleInterest(
            @RequestParam double principal,
            @RequestParam double rate,
            @RequestParam double time) {

        return calService.calculateInterest(principal, rate, time);
    }
}