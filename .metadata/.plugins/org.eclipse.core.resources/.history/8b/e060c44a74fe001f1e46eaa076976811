package com.ordermanagement.state;

public class OrderContext {
    private OrderState orderState;

    // Cập nhật trạng thái đơn hàng
    public void setState(OrderState state) {
        this.orderState = state;
    }

    // Lấy trạng thái hiện tại của đơn hàng
    public OrderState getState() {
        return this.orderState;
    }

    // Xử lý đơn hàng theo trạng thái hiện tại
    public void processOrder() {
        this.orderState.handleOrder();
    }
}
