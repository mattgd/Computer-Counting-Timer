/**
 * @(#)CalculationTimer.java
 *
 *
 * @author Matt (mattgd)
 * @version 1.00 2014/10/11
 */

import java.util.Scanner;

public class CalculationTimer {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Get the user's second input
		System.out.print("Enter the number of seconds: ");
		int interval = sc.nextInt();
		
		long startTime = System.currentTimeMillis(); // Get the start time from the computer
		long endTime = System.currentTimeMillis() + (interval * 1000); // Calculate the end time with the user's interval
 		
 		// Counts up until the time is up
 		long count = 0;
		while (System.currentTimeMillis() < endTime) {
			count++;
		}
		System.out.printf("It got up to %d.", count);
    }
}
