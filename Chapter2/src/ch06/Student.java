package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	// 1) default 생성자 로 생성 
	public Student() {} 
	
	// 2) 매개변수를 직접 넣어 생성 
	public Student(int studentNumber, String studentName, int grade) {
		
			this.studentNumber = studentNumber;
			this.studentName = studentName;
			this.grade = grade;
			// this 사용시 멤버변수 지정 됨 
	}
	
	public String showStudentInfo() {
		
		// 스트링으로 반환 됨. -> 출력문으로 출력해야 함.
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
