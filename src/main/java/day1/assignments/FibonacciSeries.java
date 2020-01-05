package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		
		int range=9, firstNum=0, secNum=0, sum;
		
		// Iterate from 1 to the range
		for(int i=1;i<=range;i++) {
			System.out.println(i);
			sum =firstNum+secNum;
			secNum=firstNum;
			sum=secNum;
			System.out.print(sum);
		}
			// Print first number 
			
			// add first and second number
			
			// Assign second number to the first number
			
			// Assign sum to the second number
			
	}

}
