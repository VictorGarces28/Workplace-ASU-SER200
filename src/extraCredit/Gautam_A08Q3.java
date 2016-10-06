package extraCredit;

/**
 * Implementation of Messaging queue where length of message are queued.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


public class Gautam_A08Q3 {

	public static void main(String[] args) {

		Message m1 = new Message("Bryan", "10/11/2016", "6:55PM", 50);
		Message m2 = new Message("Zen", "10/11/2014", "5:55PM", 60);
		Message m3 = new Message("Sam", "10/11/2012", "9:55AM", 2);

		LinkedQueue<Message> link = new LinkedQueue<Message>();
		link.enqueue(m1);
		link.enqueue(m2);
		link.enqueue(m3);
		Message m1d = link.dequeue();
		Message m2d = link.dequeue();
		Message m3d = link.dequeue();
		System.out.println("Dequeud " + " {" + "Name: " + m1d.callerName
				+ " Date: " + m1d.date + " Time: " + m1d.time
				+ " Length of Message " + m1d.callLength + "}");
		System.out.println("Dequeud " + " {" + "Name: " + m2d.callerName
				+ " Date: " + m2d.date + " Time: " + m2d.time
				+ " Length of Message " + m2d.callLength + "}");
		System.out.println("Dequeud " + " {" + "Name: " + m3d.callerName
				+ " Date: " + m3d.date + " Time: " + m3d.time
				+ " Length of Message " + m3d.callLength + "}");
	}

	public static class Message implements Comparable<Message> {
		private String callerName, date, time;
		private int callLength;

		public Message(String callerName, String date, String time,
				int callLength) {
			this.callerName = callerName;
			this.date = date;
			this.time = time;
			this.callLength = callLength;
		}

		public String getCallerName() {
			return callerName;
		}

		public String getDate() {
			return date;
		}

		public String getTime() {
			return time;
		}

		public int getCallLength() {
			return callLength;
		}

		public int compareTo(Message mes) {
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			sb1.append("");
			sb1.append(callLength);
			String callLengthStr1 = sb1.toString();
			sb2.append("");
			sb2.append(mes.getCallLength());
			String callLengthStr2 = sb2.toString();
			int x = callLengthStr1.compareTo(callLengthStr2);
			if (x < 0) {
				x = -1;
			} else if (x > 0) {
				x = 1;
			}
			return x;
		}
	}

	public static class LinkedQueue<T> implements MessageQueueADT<T> {
		private int count;
		private LinearNode<T> head, tail; // front, backs

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

		public T dequeue() {

			T result = head.getElement();
			head = head.getNext();
			count--;
			if (isEmpty())
				tail = null;
			return result;
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

	public static class LinearNode<T> {
		private LinearNode<T> next;
		private T element;

		public LinearNode() {
			next = null;
			element = null;
		}

		public LinearNode(T elem) {
			next = null;
			element = elem;
		}

		public LinearNode<T> getNext() {
			return next;
		}

		public void setNext(LinearNode<T> node) {
			next = node;
		}

		public T getElement() {
			return element;
		}

		public void setElement(T elem) {
			element = elem;
		}
	}

}