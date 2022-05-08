package ch02;

public class Order {
	
	int orderId;
	String buyerId;
	String sellerId;
	int productId;
	String orderDate;
	
	void showOrderInfo() {
		System.out.println(buyerId + "님께서 " + orderDate + "날짜에 주문하신 " + sellerId + "의 제품코드는 " + productId + "이며, 주문번호는 " + orderId + "번 입니다. ");
		
	}
}
