package com.tax.strategy;

public class CasinoGameTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.35; // Thuế 35%
    }
}
