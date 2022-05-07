package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
//		int lastScore = ++gameScore; // 151
		int lastScore = gameScore++; // 150
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
