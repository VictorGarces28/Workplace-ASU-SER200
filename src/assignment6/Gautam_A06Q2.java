package assignment6;

/**
 * Implementation of the ArrayStack class where several STACK operations like
 * pop, peek, push etc are performed on Integer array with the help of stack and
 * also first entered integer is dropped if the maximum stack size is reached.
 * 
 * Completion time: 1 hour
 * 
 * @author Kiran Gautam
 * @version 1.0
 */

public class Gautam_A06Q2 {
	/**
	 * Program entry point for drop-out stack testing.
	 * 
	 * @param args
	 *            Argument list.
	 */
	public static void main(String[] args) {
		ArrayDropOutStack<Integer> stack = new ArrayDropOutStack<Integer>(4);

		System.out.println("DROP-OUT STACK TESTING");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("The size of the stack is: " + stack.size());
		if (!stack.isEmpty())
			System.out.println("The stack contains:\n" + stack.toString());
		stack.pop();
		stack.push(7);
		stack.push(8);

		System.out.println("The size of the stack is: " + stack.size());
		if (!stack.isEmpty())
			System.out.println("The stack contains:\n" + stack.toString());
	}

	public static class ArrayDropOutStack<T> implements StackADT<T> {
		private int top;
		private T[] stack;
		private final int initialCapacity;

		@SuppressWarnings("unchecked")
		public ArrayDropOutStack(int initialCapacity) {
			top = 0;
			stack = (T[]) (new Object[initialCapacity]);
			this.initialCapacity = initialCapacity;
		}

		public void push(T element) {
			if (top == initialCapacity) {
				for (int i = 0; i < initialCapacity - 1; i++) {
					stack[i] = stack[i + 1];
				}
				stack[initialCapacity - 1] = element;
				top = initialCapacity;
			} else {
				stack[top] = element;
				top++;
			}
		}

		public T pop() throws EmptyCollectionException {
			if (isEmpty())
				throw new EmptyCollectionException("stack");

			top--;
			T result = stack[top];
			stack[top] = null;

			return result;
		}

		public T peek() throws EmptyCollectionException {

			if (isEmpty())
				throw new EmptyCollectionException("stack");
			return stack[top - 1];
		}

		public boolean isEmpty() {
			boolean x = false;
			if (top != 0) {
				x = stack[(top - 1)] == null;
			} else {
				x = stack[(top)] == null;
			}
			return x;
		}

		public int size() {
			return top;
		}

		public String toString() {
			String result = "";
			int k = top - 1;
			while (k >= 0) {
				result = result + stack[k] + "\n";
				k--;
			}
			return result;
		}
	}
}