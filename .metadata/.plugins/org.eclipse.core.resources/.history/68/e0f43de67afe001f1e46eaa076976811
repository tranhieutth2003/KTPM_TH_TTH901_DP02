package com.journaldev.week02.ex03;

abstract class PaymentDecorator implements Payment {
    protected Payment decoratedPayment;

    public PaymentDecorator(Payment decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    @Override
    public void pay(double amount) {
        decoratedPayment.pay(amount);
    }
}
