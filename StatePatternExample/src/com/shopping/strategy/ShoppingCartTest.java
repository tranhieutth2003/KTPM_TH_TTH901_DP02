package com.shopping.strategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Tạo sản phẩm
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // Thanh toán bằng PayPal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        // Thanh toán bằng Credit Card
        cart.pay(new CreditCardStrategy("John Doe", "1234567890123456", "123", "12/25"));
    }
}
