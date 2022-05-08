package ch08;

public class Order {

	public String orderNum;
	public String phoneNum;
	public String address;
	public String date; // 0으로 시작될 가능성이 있으니 String으로 지정.
	public String time; // 위와 마찬가지
	public int price;
	public String menuNum;
	
	public void orderInfo() {
		System.out.println("음식점에 배달 주문이 들어왔습니다.");
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNum);
	}
}
