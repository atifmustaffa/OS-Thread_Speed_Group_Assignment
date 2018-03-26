/**
 * 'Atif Mustaffa
 * 1429619
 * 28 Mar 2017
 * OS_Group_Assignment
 *
 */
package defaultPack;

public class Main {
	
	/**
	 * Assignment	: OS Group Assignment 
	 * Topic		: MultiThreading
	 * Task No.		: 3
	 */

	public static void main(String[] args) {
		
		// Creating tasks (object)
		Runnable task1 = new ReadAndSort(100);
		Runnable task2 = new HighestAndLowest(100);
		Runnable task3 = new MultiplicationTwoArrays(30);
		Runnable task4 = new ReadNumFromFiles(200);
		
		// Creating threads based on tasks
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		Thread thread4 = new Thread(task4);
		
		// Start all threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
	
	public Main() {
	}

}
