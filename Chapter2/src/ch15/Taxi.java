package ch15;

public class Taxi {

	String taxiCompanyName;
	int encome = 0;
	
	public Taxi(String taxiCompanyName) {
		this.taxiCompanyName = taxiCompanyName;
	} 
	
	public void take(int encome) {
		this.encome += encome;
	}
	
	public void showTaxiName() {
		System.out.println(taxiCompanyName + "택시 수입은 " + encome + "원 입니다.");
	}
}
