package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		
		Student StudentE = new Student("Edward", 20000);
		Taxi TaxiGoodC = new Taxi("잘나간다 운수");
		
		StudentE.takeTaxi(10000);
		TaxiGoodC.takeTaxi(10000);
		
		StudentE.showStudentInfo();
		TaxiGoodC.showTaxiName();
	}

}
