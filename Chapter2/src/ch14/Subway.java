package ch14;

public class Subway {

	int subwayNumber;
	int passengerCount;
	int encome;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) { // 객체 협력 
			this.encome += money;
			passengerCount++;
	}
	
	public void showSubwayInfo() {
		
		System.out.println(subwayNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + encome + "원 입니다.");
	}
}
