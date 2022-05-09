package ch14;

public class Bus {

	int busNumber;
	int passengerCount;
	int encome;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // 객체 협력 
			this.encome += money;
			passengerCount++;
	}
	
	public void showBusInfo() {
		
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + encome + "원 입니다.");
	}
}
