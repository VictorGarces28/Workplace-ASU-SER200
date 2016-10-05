package project;

/**
 * QueueADT defines the interface to a queue collection.
 *
 * @author Java Foundation
 * @version 4.0
 */
public interface QueueADT<T> {

	public void enqueue(T element);

	public T dequeue();

	public T first();

	public boolean isEmpty();

	public int size();

	public String toString();
}