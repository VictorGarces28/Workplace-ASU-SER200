package work;

/**
 * Write a description of the program here.
 * 
 * @author Lewis et al., (your name)
 * @version (program version)
 */

public class Base_A07Q2
{
    /**
     * Program entry point for queue testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        
        System.out.println("QUEUE TESTING");
        
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(4);
        System.out.println(queue.first());
        queue.dequeue();        
        queue.enqueue(9);
        queue.enqueue(8);
        System.out.println(queue.first());        
        System.out.println(queue.dequeue());
        System.out.println(queue.first());        
        
        System.out.println("The size of the queue is: " + queue.size());
        System.out.println("The queue contains:\n" + queue.toString());        
    }
    
    /**
     * LinkedQueue represents a linked implementation of a queue.
     * 
     * @author Java Foundations
     * @version 4.0
     */
    public static class LinkedQueue<T> implements QueueADT<T>
    {
        private int count;
        private LinearNode<T> head, tail; //front, back
    
        /**
         * Creates an empty queue.
         */
        public LinkedQueue()
        {
            count = 0;
            head = tail = null;
        }
    
        /**
         * Adds the specified element to the tail of this queue.
         * @param element the element to be added to the tail of the queue
         */
        public void enqueue(T element)
        {
            LinearNode<T> node = new LinearNode<T>(element);
    
            if (isEmpty())
                head = node;
            else
                tail.setNext(node);
    
            tail = node;
            count++;
        }
    
        /**
         * Removes the element at the head of this queue and returns a
         * reference to it. 
         * @return the element at the head of this queue
         * @throws EmptyCollectionException if the queue is empty
         */
        public T dequeue() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("queue");
    
            T result = head.getElement();
            head = head.getNext();
            count--;
    
            if (isEmpty())
                tail = null;
    
            return result;
        }
       
        /**
         * Returns a reference to the element at the head of this queue.
         * The element is not removed from the queue.  
         * @return a reference to the first element in this queue
         * @throws EmptyCollectionsException if the queue is empty
         */
        public T first() throws EmptyCollectionException
        {
            //TODO: Implement me.
            return null;
        }
    
        /**
         * Returns true if this queue is empty and false otherwise. 
         * @return true if this queue is empty 
         */
        public boolean isEmpty()
        {
            //TODO: Implement me.
            return false;
        }
     
        /**
         * Returns the number of elements currently in this queue.
         * @return the number of elements in the queue
         */
        public int size()
        {
            //TODO: Implement me.
            return 0;
        }
    
        /**
         * Returns a string representation of this queue. The front element
         * occurs first, and each element is separated by a space. If the
         * queue is empty, returns "empty".
         * @return the string representation of the queue
         */
        public String toString()
        {
            //TODO: Implement me.
            return "";
        }
    }
}