package work;

public class LibraryMain {

	public static void main(String[] args) throws Exception {

		LibraryBook book1 = new LibraryBook("Kiran","This is the book1",1990);
		LibraryBook book2 = new LibraryBook("Kiran","This is the book2",1990);
		LibraryBook book3 = new LibraryBook("Kiran","This is the book3",1990);

		LibraryBookList<LibraryBook> book = new LibraryBookList<LibraryBook>();
		book.add(1, book1);
		book.add(2, book2);
		book.add(3, book3);
		//System.out.println(book.toString());
		//System.out.println(book.getSize());
		System.out.println("bol "+book.contains(book1));	
	}

}
