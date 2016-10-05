package work;


public class LibraryBookList<LibraryBook> {

	private int listSize;  
    private LibraryBookNode<LibraryBook> head; 
    
    public LibraryBookList()
    {
    	listSize = 0;
    	head = null;
    }

    public void add(int index)
    {
    	LibraryBookNode<LibraryBook> temp = new LibraryBookNode<LibraryBook>(lb);
        temp.setNext(head);
        head = temp;
        listSize++;
    }
    
    public boolean contains(LibraryBook lb)
    {
    	boolean result = false;
    	
    	while(head!=null)
		{
    		if(head.getLibraryBook().equals(lb));
    		{
    		result = true;
    		}
    		head.getNext();
		}
    return result;
    }
    
    //get
    public LibraryBook get(int Index) throws Exception
    {
        if (isEmpty())
            throw new Exception();
        //TODO the indexing
        LibraryBook result = head.getLibraryBook();
        head = head.getNext();
        listSize--;
        return result;
    }
    
    public LibraryBook remove(int index) throws Exception
    {
        if (isEmpty())
            throw new Exception();
        //TODO the indexing
        LibraryBook result = head.getLibraryBook();
        head = head.getNext();
        listSize--;
 
        return result;
    }
    
    public int getSize()
    {
        return listSize;
    }
    

    public boolean isEmpty()
    {
        return head == null;
    }

    public String toString()
    {
    	String k = "";
    	if (head==null)
    		k = "empty";
    	else
    	{
    		while(head!=null)
    		{
    		k = head.getLibraryBook().toString() + k;
    		k = "\n" + k;
    		head = head.getNext();
    		}
    	}
    return k;
}
}
