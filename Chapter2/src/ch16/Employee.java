package ch16;

public class Employee {
	
	public static int serialNum = 1000; // static변수 -> 메모리의 data영역에 저장되고, 인스턴스들의 공유메모리로 사용된다.
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() { // default 생성자 
		serialNum++;	// 여기까지 코드는 다 같은 값을 같게 함 
		employeeId = serialNum; // 이렇게 함으로써 각자 번호를 부여받을 수 있게 함.	
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
}