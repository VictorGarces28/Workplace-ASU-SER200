package assignment6;

import java.util.Scanner;
import java.util.Stack;

/**
 * Using the stack provided by the Java API (java.util.Stack), this program
 * prints user input line of texts in reverse.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */
public class Gautam_A06Q3 {

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
