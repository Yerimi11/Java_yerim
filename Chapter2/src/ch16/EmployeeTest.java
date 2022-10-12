package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
	// 실행해보면 두 인스턴스 다 ++가 되어있다. 
	// 이를 통해, 두 개의 인스턴스가 하나의 메모리를 공유하고 있음을 알 수 있다.
		
		Employee employeeLee = new Employee(); // Employee 로 선언된 지역변수 employeeLee
		employeeLee.setEmployeeName("이토깽");
		
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김호랑");
		employeeKim.serialNum++;
		
		System.out.println(employeeLee.serialNum);
		System.out.println(employeeKim.serialNum);
	}

}

// [Memory]
// Data 영역		- serialNum (static변수, 공유메모리)
// Stack memory - employeeLee, employeeKim
// Heap memory	- .setEmployeeName
// Stack -> Data영역을 참조(공유메모리), Heap을 참조.