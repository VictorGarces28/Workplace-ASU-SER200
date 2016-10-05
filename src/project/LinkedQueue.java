package project;

public class LinkedQueue<T> implements QueueADT<T> {
	private int count;
	private LinearNode<T> head, tail; // front, back

	public LinkedQueue() {
		count = 0;
		head = tail = null;
	}

	public void enqueue(T element) {
		LinearNode<T> node = new LinearNode<T>(element);

		if (isEmpty())
			head = node;
		else
			tail.setNext(node);

		tail = node;
		count++;
	}

	public T dequeue() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		T result = head.getElement();
		head = head.getNext();
		count--;

		if (isEmpty())
			tail = null;

		return result;
	}

	public T first() throws EmptyCollectionException {
		if (head == null)
			throw new EmptyCollectionException("queue");
		return head.getElement();
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String k = "";
		LinearNode<T> temp = head;
		while (temp != null) {
			k += temp.getElement().toString();
			k += " ";
			temp = temp.getNext();
		}
		return k;
	}
}