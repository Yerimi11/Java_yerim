package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person personTomas = new Person();
		
		personTomas.name = "Tomas";
		personTomas.age = 37;
		personTomas.height = 180;
		personTomas.weight = 78;
		personTomas.gender = "남성";
		
		personTomas.showPersonInfo();
	}

}
