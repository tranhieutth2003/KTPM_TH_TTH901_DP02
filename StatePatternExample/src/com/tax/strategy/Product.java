package com.tax.strategy;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        return taxStrategy.calculateTax(price);
    }

    public void displayPriceWithTax() {
        double tax = calculateTax();
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: " + price + " VND");
        System.out.println("Thuế: " + tax + " VND");
        System.out.println("Tổng tiền phải trả: " + (price + tax) + " VND");
        System.out.println("-----------------------------------");
    }
}
