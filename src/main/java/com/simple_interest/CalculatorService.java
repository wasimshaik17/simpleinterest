package com.simple_interest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final InterestCalculator interestCalculator;

    public CalculatorService(InterestCalculator interestCalculator) {
        this.interestCalculator = interestCalculator;
    }

    public double calculateInterest(double principal, double rate, double time) {
        return interestCalculator.calculate(principal, rate, time);
    }
}