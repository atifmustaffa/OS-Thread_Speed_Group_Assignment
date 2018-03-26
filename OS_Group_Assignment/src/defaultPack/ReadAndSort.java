/**
 * 'Atif Mustaffa
 * 1429619
 * 28 Mar 2017
 * OS_Group_Assignment
 *
 */
package defaultPack;

public class ReadAndSort implements Runnable {
	
	/**
	 * Task 1
	 */
	
	private int[] queue = null;
	private long startTime = 0;
	
	public ReadAndSort(int total_items) {
		
		// Initialize array of size 'total_items'
		this.queue = new int[total_items];
		// Generate random numbers of 'total_items' with range 1-100
		this.queue = randomNumber(total_items, 100);
		// Set start time
		this.startTime = System.currentTimeMillis();
		
	}
	
	@Override
	public void run() {
				
		// Sorting method
		for(int i = 0; i < queue.length; i++)
			for(int j = 0; j < queue.length - 1; j++)
				if(queue[j+1] < queue[j]) {
					int temp = queue[j+1];
					queue[j+1] = queue[j];
					queue[j] = temp;
				}
		
		// Display output
		System.out.println("Thread1: Sorted queue is: ");
		for(int no: queue)
			System.out.print(no +" ");
		
		// End time
		long endTime = System.currentTimeMillis();
		// Display total execution time
		System.out.println("Thread1 Runtime: " +(endTime-startTime) +" miliseconds");
		
	}
	
	public int[] randomNumber(int size, int max) {
		// Generate random num and pass to array
		int[] num = new int[size];
		for(int i = 0; i < size; i++)
			num[i] = 1 + ((int)(Math.random() * max));
		return num;
	}

}
