package com.tax.strategy;

public class MassageKaraokeTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.30; // Thuế 30%
    }
}
