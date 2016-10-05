package work;

public class LibraryMain {

	public static void main(String[] args) throws Exception {
		LibraryBook book1 = new LibraryBook("Harper Lee","To Kill A Mockingbird",1960);
		LibraryBook book2 = new LibraryBook("Cheryl Strayed","Wild",2012);
		LibraryBook book3 = new LibraryBook("Harper Lee","Go Set A Watchman",2015);
		LibraryBook book4 = new LibraryBook("Sandy Hall","A Little Something Different",2014);
		LibraryBookList<LibraryBook> book = new LibraryBookList<LibraryBook>();
		book.add(1, book1);
		book.add(2, book2);
		book.add(3, book3);
		book.add(4, book4);
		System.out.println(book.toString());
		book.remove(2);
		book.remove(3);
		System.out.print("Contents after elements removed: ");
		System.out.println(book.toString());
		System.out.println(book.isEmpty());
		System.out.println(book.getSize());
	}

}
