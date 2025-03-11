package com.ordermanagement.state;

public class ProcessingState implements OrderState {
    @Override
    public void handleOrder() {
        System.out.println("Đóng gói và vận chuyển đơn hàng...");
    }
}
