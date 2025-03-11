package com.tax.strategy;

public class TaxCalculationTest {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop (VAT)", 15000000, new VATTax());
        Product product2 = new Product("Dịch vụ Massage", 500000, new MassageKaraokeTax());
        Product product3 = new Product("Casino", 1000000, new CasinoGameTax());
        Product product4 = new Product("Bia Heineken", 20000, new BeerTax());

        product1.displayPriceWithTax();
        product2.displayPriceWithTax();
        product3.displayPriceWithTax();
        product4.displayPriceWithTax();
    }
}
