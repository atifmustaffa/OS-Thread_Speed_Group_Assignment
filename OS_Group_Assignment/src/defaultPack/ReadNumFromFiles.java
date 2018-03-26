/**
 * 'Atif Mustaffa
 * 1429619
 * 28 Mar 2017
 * OS_Group_Assignment
 *
 */
package defaultPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumFromFiles implements Runnable {
	
	/**
	 * Task 4
	 */

	private int[] num = null;
	private long startTime = 0;
	
	public ReadNumFromFiles(int total_items) {
		
		// Initialize array of size 'total_items'
		this.num = new int[total_items];
		// Set start time
		this.startTime = System.currentTimeMillis();
		
	}
	
	@Override
	public void run() {
			
		// Start time
		long startTime = System.currentTimeMillis();
		
		// Read numbers from an external file (200 integers randomly generated range:1-1000)
		File file = new File("numbers.txt");
		Scanner input;
		try {
			input = new Scanner(file);
			int i = 0;
			while (input.hasNext() && i < num.length) {
				num[i] = Integer.parseInt(input.nextLine());
				i++;
			}
			
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Calculating the total number and the average
		int total = 0;
		double average;
		for(int no: num)
			total += no;
		average = total/num.length;
		
		// Display output
		System.out.println("Thread4: Numbers in the array are: ");
		for(int no: num)
			System.out.print(no +" ");
		System.out.println("Total is " +total +" and average is " +average);
		
		// End time
		long endTime = System.currentTimeMillis();
		// Display total execution time
		System.out.println("Thread4 Runtime: " +(endTime-startTime) +" miliseconds");
		
	}

}