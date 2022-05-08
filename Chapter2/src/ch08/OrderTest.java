package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order ordered = new Order();
		ordered.orderNum = "202011020003";
		ordered.phoneNum = "01023450001";
		ordered.address = "서울시 강남구 역삼동 111-333";
		ordered.date = "20201102";
		ordered.time = "130258";
		ordered.price = 35000;
		ordered.menuNum = "0003";
		
		ordered.orderInfo();
	}

}
