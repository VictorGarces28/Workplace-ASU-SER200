package work;

/**
 * DequeADT defines the interface to a deque collection.
 *
 * @author Lewis et al., CST200
 * @version 1.0
 */
public interface DequeADT<T>
{
    /**  
     * Adds one element to the front of this deque. 
     * @param element the element to be added to the front of the deque  
     */
    public void enqueueFront(T element); //deque specific
    
    /**  
     * Adds one element to the back of this deque. 
     * @param element the element to be added to the back of the deque  
     */
    public void enqueueBack(T element);

    /**  
     * Removes and returns the element at the front of this deque.
     * Should throw an exception if the deque is empty.
     * @return the element at the front of this deque
     */
    public T dequeueFront();
    
    /**  
     * Removes and returns the element at the back of this deque.
     * Should throw an exception if the deque is empty.
     * @return the element at the back of the deque. 
     */
    public T dequeueBack(); //deque specific  

    /**  
     * Returns, without removing, the element at the front of this deque.
     * Should throw an exception if the deque is empty.
     * @return the first element in the deque
     */
    public T first();
    
    /**  
     * Returns, without removing, the element at the back of this deque.
     * Should throw an exception if the deque is empty.
     * @return the last element in the deque
     */
    public T last(); //deque specific  
   
    /**  
     * Returns true if this deque is empty and false otherwise.
     * @return true if this deque is empty
     */
    public boolean isEmpty();

    /**  
     * Returns the number of elements in this deque. 
     * @return the number of elements in the deque
     */
    public int size();

    /**  
     * Returns a string representation of this deque. The front element
     * occurs first, and each element is separated by a space. If the
     * deque is empty, returns "empty".
     * @return the string representation of the deque
     */
    public String toString();
}