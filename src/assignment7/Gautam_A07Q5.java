package assignment7;

/**
 * Demonstrates sorting an array of objects.
 *
 * Completion time: 30 min
 *
 * @author Kiran Gautam
 * @version V1.0
 */
import java.util.Arrays;

public class Gautam_A07Q5 {
	/**
	 * Program entry point for bubblesort testing.
	 * 
	 * @param args
	 *            Argument list.
	 */
	public static void main(String[] args) {
		// Integer[] data = {72, 54, 31, 39, 53, 9, 81, 73, 98, 99};
		Integer[] data = { 9, 39, 31, 53, 54, 72, 73, 81, 98, 99 };
		System.out.println("Before: " + Arrays.toString(data));
		bubbleSort(data);
		System.out.println("After: " + Arrays.toString(data));
	}

	/**
	 * Swaps to elements in an array. Used by various sorting algorithms.
	 * 
	 * @param data
	 *            the array in which the elements are swapped
	 * @param index1
	 *            the index of the first element to be swapped
	 * @param index2
	 *            the index of the second element to be swapped
	 */
	private static <T extends Comparable<T>> void swap(T[] data, int index1,
			int index2) {
		T temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

	/**
	 * Sorts the specified array of objects using a bubble sort algorithm. 
	 * Stops the sort if a pass makes no changes.
	 *
	 * @param data
	 *            the array to be sorted
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] data) {
		int position, scan;
		T temp;
		int swaps;
		for (position = data.length - 1; position >= 0; position--) {
			swaps = 0;
			for (scan = 0; scan <= position - 1; scan++) {
				if (data[scan].compareTo(data[scan + 1]) > 0) {
					swap(data, scan, scan + 1);
					swaps++;
				}

			}
			if (swaps == 0) {
				break;
			}
		}
	}
}
