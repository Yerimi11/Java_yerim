package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		
		Student StudentE = new Student("Edward", 20000);
		Taxi TaxiGoodC = new Taxi("잘 간다 운수");
		
		StudentE.takeTaxi(TaxiGoodC);
		
		StudentE.showStudentInfo();
		TaxiGoodC.showTaxiCompany();
	}

}
