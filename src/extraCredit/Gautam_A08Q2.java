package extraCredit;

public class Gautam_A08Q2
{
public static class LibraryMain {

	public static void main(String[] args) throws Exception {
		Gautam_A08Q01.LibraryBook book1 = new Gautam_A08Q01.LibraryBook("Harper Lee", "To Kill A Mockingbird", 1960);
		Gautam_A08Q01.LibraryBook book2 = new Gautam_A08Q01.LibraryBook("Cheryl Strayed", "Wild", 2012);
		Gautam_A08Q01.LibraryBook book3 = new Gautam_A08Q01.LibraryBook("Harper Lee", "Go Set A Watchman", 2015);
		Gautam_A08Q01.LibraryBook book4 = new Gautam_A08Q01.LibraryBook("Sandy Hall", "A Little Something Different", 2014);
		Gautam_A08Q01.LibraryBookList<Gautam_A08Q01.LibraryBook> book = new Gautam_A08Q01.LibraryBookList<Gautam_A08Q01.LibraryBook>();
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
}