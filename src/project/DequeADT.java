package project;

/**
 * DequeADT defines the interface to a deque collection.
 *
 * @author Lewis et al., CST200
 * @version 1.0
 */
public interface DequeADT<T> {
	public void enqueueFront(T element);

	public void enqueueBack(T element);

	public T dequeueFront();

	public T dequeueBack();

	public T first();

	public T last();

	public boolean isEmpty();

	public int size();

	public String toString();
}