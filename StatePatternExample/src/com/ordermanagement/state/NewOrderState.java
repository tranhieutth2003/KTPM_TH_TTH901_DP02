package com.ordermanagement.state;

public class NewOrderState implements OrderState{

	@Override
	public void handleOrder() {
		System.out.println("Kiểm tra thông tin đơn hàng...");
		
	}

}
