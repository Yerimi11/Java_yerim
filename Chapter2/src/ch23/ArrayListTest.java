package ch23;

import java.util.ArrayList;

import ch21.Book;


public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("할 수 있다1 ", "예림"));
		library.add(new Book("할 수 있다2 ", "예림"));
		library.add(new Book("할 수 있다3 ", "예림"));
		library.add(new Book("할 수 있다4 ", "예림"));
		library.add(new Book("할 수 있다5 ", "예림"));
		
		for(int i = 0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
