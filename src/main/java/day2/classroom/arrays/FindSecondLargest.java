package day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		
		Arrays.sort(data);
		System.out.println("The Largest value: "+data[5]);
		System.out.println("The Second largest value: "+data[4]);
			
		// Print the second largest number	
		
		
	}

}
