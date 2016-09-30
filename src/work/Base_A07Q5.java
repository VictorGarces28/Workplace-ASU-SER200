package work;

/**
 * Demonstrates sorting an array of objects.
 *
 * @author Lewis et al., (your name)
 * @version (program version)
 */
import java.util.Arrays;

public class Base_A07Q5
{
    /**
     * Program entry point for bubblesort testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
         Integer[] data = {72, 54, 31, 39, 53, 9, 81, 73, 98, 99};
         
         System.out.println("Before: " + Arrays.toString(data));
         bubbleSort(data);
         System.out.println("After: " + Arrays.toString(data));
    }
    
	/**
	 * Swaps to elements in an array. Used by various sorting algorithms.
	 * 
	 * @param data   the array in which the elements are swapped
	 * @param index1 the index of the first element to be swapped
	 * @param index2 the index of the second element to be swapped
	 */
	private static <T extends Comparable<T>> 
		void swap(T[] data, int index1, int index2)
	{
		T temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
    /**
     * Sorts the specified array of objects using a bubble sort
     * algorithm.
     * TODO: Stops the sort if a pass makes no changes.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
		void bubbleSort(T[] data)
    {
        int position, scan;
        T temp;
		
        for (position =  data.length - 1; position >= 0; position--)
        {
            for (scan = 0; scan <= position - 1; scan++)
            {
                if (data[scan].compareTo(data[scan+1]) > 0)
                    swap(data, scan, scan + 1);
            }
        }
    }
}
