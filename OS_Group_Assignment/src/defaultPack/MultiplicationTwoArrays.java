/**
 * 'Atif Mustaffa
 * 1429619
 * 28 Mar 2017
 * OS_Group_Assignment
 *
 */
package defaultPack;

public class MultiplicationTwoArrays implements Runnable {
	
	/**
	 * Task 3
	 */

	private int[] array1 = null;
	private int[] array2 = null;
	private int[] array_product = null;
	private long startTime = 0;
	
	public MultiplicationTwoArrays(int size) {
		
		// Initialize array of size 'size'
		this.array1 = new int[size];
		this.array2 = new int[size];
		this.array_product = new int[size];
		// Generate random numbers of 'size' with range 1-100
		this.array1 = randomNumber(size, 100);
		this.array2 = randomNumber(size, 100);
		// Set start time
		this.startTime = System.currentTimeMillis();
	}
	
	@Override
	public void run() {
		
		// Start time
		long startTime = System.currentTimeMillis();
		
		// Calculate the multiplication of the two arrays		
		// Display output
		System.out.println("Thread3: Product of the two arrays are: ");
		for(int i = 0; i < array_product.length; i++) {
			array_product[i] = array1[i] * array2[i];
			System.out.println(array1[i] +" * " +array2[i] +" = " +array_product[i]);
		}
		
		// End time
		long endTime = System.currentTimeMillis();
		// Display total execution time
		System.out.println("Thread3 Runtime: " +(endTime-startTime) +" miliseconds");
		
	}
	
	public int[] randomNumber(int size, int max) {
		// Generate random num and pass to array
		int[] num = new int[size];
		for(int i = 0; i < size; i++)
			num[i] = 1 + ((int)(Math.random() * max));
		return num;
	}

}