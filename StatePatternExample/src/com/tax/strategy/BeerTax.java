package com.tax.strategy;

public class BeerTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.65; // Thuế 65%
    }
}
