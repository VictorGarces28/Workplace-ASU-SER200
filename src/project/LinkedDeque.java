package project;

/**
 * Structure of LinkedDeque collection.
 * 
 * Completion time: 1 hr
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


public class LinkedDeque<T> implements DequeADT<T> {
	private int count;
	private LinearDoubleNode<T> head, tail;

	public LinkedDeque() {
		count = 0;
		head = tail = null;
	}

	public void enqueueFront(T element) {
		LinearDoubleNode<T> node = new LinearDoubleNode<T>(element);

		if (isEmpty()) {
			node.setPrev(null);
			node.setNext(null);
			head = node;
			tail = node;
		} else {
			head.setPrev(node);
			node.setNext(head);
			node.setPrev(null);
			head = node;

		}
		count++;
	}

	public void enqueueBack(T element) {
		LinearDoubleNode<T> node = new LinearDoubleNode<T>(element);

		if (isEmpty()) {
			node.setPrev(null);
			node.setNext(null);
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(null);
			tail = node;
		}
		count++;
	}

	public T dequeueFront() {
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		T result = head.getElement();
		head = head.getNext();
		// head.setPrev(null);
		count--;

		if (isEmpty())
			tail = null;

		return result;
	}

	@Override
	public T dequeueBack() {
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		T result = tail.getElement();
		tail = tail.getPrev();
		// tail.setNext(null);
		count--;

		if (isEmpty())
			tail = null;

		return result;
	}

	public T first() {
		if (head == null)
			throw new EmptyCollectionException("queue");
		return head.getElement();
	}

	public T last() {
		if (tail == null)
			throw new EmptyCollectionException("queue");
		return tail.getElement();
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int size() {
		return count;
	}

	public String toString() {
		String k = "";
		LinearDoubleNode<T> tempNode = head;
		while (tempNode != null) {
			k += tempNode.getElement().toString();
			k += " ";
			tempNode = tempNode.getNext();
		}
		return k;
	}
}