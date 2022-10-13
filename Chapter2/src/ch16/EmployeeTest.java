package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
	// 16,18,19line 주석을 풀고 20,21을 주석한 후 실행해보면 두 인스턴스 다 ++가 되어있다. 
	// 이를 통해, 두 개의 인스턴스가 하나의 메모리를 공유하고 있음을 알 수 있다.
		
		// 인스턴스 생성 코드 1
		Employee employeeLee = new Employee(); // Employee 로 선언된 지역변수 employeeLee
		employeeLee.setEmployeeName("이토깽");
		
		System.out.println(employeeLee.serialNum); // 노란색 줄 : 얘는 static변수로 참조되어있으니, 클래스로 사용해라.
		// (Employee.serialNum); 으로 작성해 클래스로도 사용할 수 있다.
		
		// 인스턴스 생성 코드 2
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김호랑");
//		employeeKim.serialNum++; // 강제 증가 
		
//		System.out.println(employeeLee.serialNum);
//		System.out.println(employeeKim.serialNum);
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	}

}

// [Memory]
// Data 영역		- serialNum (static변수, 공유메모리)
// Stack memory - employeeLee, employeeKim
// Heap memory	- .setEmployeeName
// Stack -> Data영역을 참조(공유메모리), Heap을 참조한다.
 