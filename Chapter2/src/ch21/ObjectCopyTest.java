package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("할 수 있다1", "예림");
		library[1] = new Book("할 수 있다2", "예림");
		library[2] = new Book("할 수 있다3", "예림");
		library[3] = new Book("할 수 있다4", "예림");
		library[4] = new Book("할 수 있다5", "예림");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); 	// 주소값까지 똑같이 copy된다.
		
//		System.out.println("== library ==");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("== copy library ==");
//	 	for(Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
	 	
		
	 	// 일부 객체의 값을 변경하면 원본 값, copy 값 모두 같이 변경된다. (얕은 복사)
	 	library[0].setAuthor("올리브");
	 	library[0].setTitle("수분가득 원두의 비결");
	 	
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copy library ==");
	 	for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	 	
	 	
	 	// 깊은 복사를 위해서는, copyLibrary[index] = new Book(); 으로 새로 객체를 만든 후,
	 	// for문을 돌려 copyLibrary[i].setTitle(library[i].getTitle()); 로 생성해준다.
	 	
	 	
	 	
	}

}
