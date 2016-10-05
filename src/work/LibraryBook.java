package work;

public class LibraryBook {

	private String author, title;
	private int year;
	
	public LibraryBook(String author, String title, int year) {
		this.author = author;
		this.title = title;
		this.year = year;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String toString()
	{
		return "Author "+author+" Title: "+title+ " Year: "+year;
	}
}
