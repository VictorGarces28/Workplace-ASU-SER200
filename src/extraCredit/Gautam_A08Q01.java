package extraCredit;

public class Gautam_A08Q01 {

	public static class LibraryBook {

		private String author, title;
		private int year;

		public LibraryBook(String author, String title, int year) {
			this.author = author;
			this.title = title;
			this.year = year;
		}

		public String getTitle() {
			return title;
		}

		public String getAuthor() {
			return author;
		}

		public int getYear() {
			return year;
		}

		public String toString() {
			return title + " " + author + " " + year;
		}
	}

	@SuppressWarnings("hiding")
	public static class LibraryBookList<LibraryBook> {

		private int listSize;
		private LibraryBookNode<LibraryBook> head;

		public LibraryBookList() {
			listSize = 0;
			head = null;
		}

		public void add(int index, LibraryBook lb) {
			LibraryBookNode<LibraryBook> temp = new LibraryBookNode<LibraryBook>(lb);
			temp.setNext(head);
			head = temp;
			listSize++;
		}

		public boolean contains(LibraryBook lb) {
			boolean result = false;

			for (int i = 0; i < listSize; i++) {
				if (head.getLibraryBook().toString() == lb.toString());
				{
					result = true;
				}
				head = head.getNext();
			}
			return result;
		}

		public LibraryBook get(int Index) throws Exception {
			if (isEmpty())
				throw new Exception();
			// TODO the indexing
			LibraryBook result = head.getLibraryBook();
			head = head.getNext();
			listSize--;
			return result;
		}

		public LibraryBook remove(int index) throws Exception {
			if (isEmpty())
				throw new Exception();
			// TODO the indexing
			LibraryBook result = head.getLibraryBook();
			head = head.getNext();
			listSize--;

			return result;
		}

		public int getSize() {
			return listSize;
		}

		public boolean isEmpty() {
			return listSize == 0;
		}

		public String toString() {
			String k = "";
			LibraryBookNode<LibraryBook> temp = head;
			while (temp != null) {
				k = temp.getLibraryBook().toString() + k;
				k = "\n" + k;
				temp = temp.getNext();
			}

			return k;
		}
	}

	@SuppressWarnings("hiding")
	public static class LibraryBookNode<LibraryBook> {
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
}