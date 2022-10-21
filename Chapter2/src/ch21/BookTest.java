package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];	// new는 초기화를 한다. int는 0, double은 0.0, 객체는 null.
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);	// null 값이 5번 출력된다.
//		}
		
		library[0] = new Book("할 수 있다1", "예림");
		library[1] = new Book("할 수 있다2", "예림");
		library[2] = new Book("할 수 있다3", "예림");
		library[3] = new Book("할 수 있다4", "예림");
		library[4] = new Book("할 수 있다5", "예림");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		
	}

}
