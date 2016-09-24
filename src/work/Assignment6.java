package work;

import java.util.Scanner;
import java.util.Stack;

public class Assignment6 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		String userInput;
		do {
			System.out.println("Please enter a line of text:");
			userInput = scan.nextLine();
			if (!userInput.equals("DONE")) {
				stack.push(userInput);
			}
		} while (!userInput.equals("DONE"));
		scan.close();
		for (int i = stack.size(); i > 0; i--) {
			System.out.println(stack.get(i - 1));
		}
	}

}
