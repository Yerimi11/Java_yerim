package ch02;

public class OrderTest {
	
	public static void main(String[] args) {
	
		Order OrderIphone = new Order();
		
		OrderIphone.buyerId = "yerim";
		OrderIphone.orderId = 10;
		OrderIphone.orderDate = "220508";
		OrderIphone.productId = 500;
		OrderIphone.sellerId = "Apple";
		
		OrderIphone.showOrderInfo();
	}
}
