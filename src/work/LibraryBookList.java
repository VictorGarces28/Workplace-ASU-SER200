package work;


public class LibraryBookList<LibraryBook> {

	private int listSize;  
    private LibraryBookNode<LibraryBook> head; 
    
    public LibraryBookList()
    {
    	listSize = 0;
    	head = null;
    }

    public void add(int index, LibraryBook lb)
    {
    	LibraryBookNode<LibraryBook> temp = new LibraryBookNode<LibraryBook>(lb);
        temp.setNext(head);
        head = temp;
        listSize++;
    }
    
    public boolean contains(LibraryBook lb)
    {
    	boolean result = false;
    	
    	for (int i=0;i<listSize;i++)
		{
    		if(head.getLibraryBook().toString()==lb.toString());
    		{
    			System.out.println("a: "+head.getLibraryBook().toString());
    			System.out.println("b: "+lb.toString());

    		result = true;
    		}
    		head = head.getNext();
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
        return listSize == 0;
    }

    public String toString()
    {
    	String k = "";
    	LibraryBookNode<LibraryBook> temp = head;
    		while(temp!=null)
    		{
    		k = temp.getLibraryBook().toString() + k;
    		k = "\n" + k;
    		temp = temp.getNext();
    		}
    	
    return k;
}
}
