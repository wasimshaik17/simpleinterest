package com.simple_interest;

import org.springframework.stereotype.Service;

@Service
public class SimpleInterestCalculator implements InterestCalculator {

    @Override
    public double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}