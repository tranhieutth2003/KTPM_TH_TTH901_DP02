package com.ordermanagement.state;

public class OrderManagementSystem {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        // Trạng thái: Mới tạo
        order.setState(new NewOrderState());
        order.processOrder();

        // Trạng thái: Đang xử lý
        order.setState(new ProcessingState());
        order.processOrder();

        // Trạng thái: Đã giao
        order.setState(new DeliveredState());
        order.processOrder();

        // Trạng thái: Hủy
        order.setState(new CancelledState());
        order.processOrder();
    }
}
