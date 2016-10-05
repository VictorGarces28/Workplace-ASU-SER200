package project;

/**
 * Program to create a LinearDoubleNode structure.
 *
 * Completion time: 2 hours
 *
 * @author Kiran Gautam
 * @version V1.0
 */

public class LinearDoubleNode<T> {
	private LinearDoubleNode<T> next, previous;
	private T element;

	public LinearDoubleNode() {
		previous.next = next;
		next.previous = previous;
	}

	public LinearDoubleNode(T elem) {
		element = elem;
	}

	public LinearDoubleNode<T> getNext() {
		return next;
	}

	public void setNext(LinearDoubleNode<T> node) {
		next = node;
	}

	public LinearDoubleNode<T> getPrev() {
		return previous;
	}

	public void setPrev(LinearDoubleNode<T> node) {
		previous = node;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T elem) {
		element = elem;
	}
}
