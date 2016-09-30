package work;

/**
 * Write a description of the program here.
 * 
 * @author Lewis et al., (your name)
 * @version (program version)
 */

public class Base_A07Q4
{
    /**
     * Program entry point for deque testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        LinkedDeque<Integer> deque = new LinkedDeque<Integer>();
        
        System.out.println("DEQUE TESTING");
        
        //per Q1
        deque.enqueueBack(3);
        deque.enqueueBack(7);
        deque.enqueueBack(4);
        deque.dequeueFront();        
        deque.enqueueBack(9);
        deque.enqueueBack(8);
        deque.dequeueFront();
        System.out.println("The size of the deque is: " + deque.size());
        System.out.println("The deque contains:\n" + deque.toString());   
        
        //new features
        System.out.println(deque.dequeueFront());        
        deque.enqueueFront(1);
        deque.enqueueFront(11);                         
        deque.enqueueFront(3);                 
        deque.enqueueFront(5);         
        System.out.println(deque.dequeueBack());
        System.out.println(deque.dequeueBack());        
        System.out.println(deque.last());                
        deque.dequeueFront();
        deque.dequeueFront();        
        System.out.println(deque.first());        
        System.out.println("The size of the deque is: " + deque.size());
        System.out.println("The deque contains:\n" + deque.toString());            
    }
    
    /**
     * LinkedDeque represents a linked implementation of a deque.
     * 
     * @author Lewis et al., CST200
     * @version 1.0
     */
    public static class LinkedDeque<T> implements DequeADT<T>
    {
        //TODO: Implement me.
    }
}