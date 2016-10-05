package work;

public class LibraryBookNode<LibraryBook> {
	private LibraryBookNode<LibraryBook> next;
	private LibraryBook data;

	public LibraryBookNode(LibraryBook data) {
		next = null;
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