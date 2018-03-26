/**
 * 'Atif Mustaffa
 * 1429619
 * 28 Mar 2017
 * OS_Group_Assignment
 *
 */
package defaultPack;

public class HighestAndLowest implements Runnable {
	
	/**
	 * Task 2
	 */

	private int[] array = null;
	private long startTime = 0;
	
	public HighestAndLowest(int total_items) {

		// Initialize array of size 'total_items'
		this.array = new int[total_items];
		// Generate random numbers of 'total_items' with range 1-100
		this.array = randomNumber(total_items, 100);
		// Set start time
		this.startTime = System.currentTimeMillis();
		
	}

	@Override
	public void run() {
		
		// Start time
		long startTime = System.currentTimeMillis();
		int min = array[0];
		int max = array[0];
		
		// Scan the min and max of numbers in the array
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
		
		// Display output
		System.out.println("Thread2: Numbers in the array are: ");
		for(int no: array)
			System.out.print(no +" ");
		System.out.println("Maximum is " +max +" and minimum is " +min);
				
		// End time
		long endTime = System.currentTimeMillis();
		// Display total execution time
		System.out.println("Thread2 Runtime: " +(endTime-startTime) +" miliseconds");
		
	}
	
	public int[] randomNumber(int size, int max) {
		// Generate random num and pass to array
		int[] num = new int[size];
		for(int i = 0; i < size; i++)
			num[i] = 1 + ((int)(Math.random() * max));
		return num;
	}

}
