package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2); // 둘의 주소값은 같다.
		
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);

	}

}
