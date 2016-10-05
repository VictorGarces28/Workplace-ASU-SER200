package work;

public class LibraryBookNode<LibraryBook> {
	private LibraryBookNode<LibraryBook> next;
	private LibraryBook data;

	public LibraryBookNode(LibraryBook data, LibraryBookNode<LibraryBook> node) {
		next = node;
		this.data = data;
	}

	public LibraryBookNode<LibraryBook> getNext() {
		return next;
	}

	public LibraryBook getLibraryBook() {
		return data;
	}

	public void setNext(LibraryBookNode<LibraryBook> node) {
		next = node;
	}

}