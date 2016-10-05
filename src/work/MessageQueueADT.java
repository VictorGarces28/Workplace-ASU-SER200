package work;

/**
 * MessageQueueADT defines the interface to a queue holding messages.
 *
 * @author Barnai
 * @version 1.0
 */
public interface MessageQueueADT<Message> {

    /**  
     * Adds one message to the queue. 
     * @param m  the message to be added to the queue  
     */
    public void enqueue(Message m);

    /**  
     * Removes and returns the highest priority message in the queue.
     * @return the highest priority message in the queue
     */
    public Message dequeue();

    /**  
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty();

    /**  
     * Returns the number of elements in this queue. 
     * @return the integer representation of the size of the queue
     */
    public int size();
}