package ch06;

public class StudentTest { // Client 역할 

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // default 생성자 
		studentLee.grade = 1;
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
