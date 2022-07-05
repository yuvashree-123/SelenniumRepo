package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
		//The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.
		
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int  range = 8, firstNum = 0, secNum = 1, sum ;
		// Print first number
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <=8; i++) {
			// add first and second number assign to sum
			sum = firstNum + secNum;
			//1+1=1
			//sum = 2		
			// Assign second number to the first number
			firstNum = secNum;//1
			// Assign sum to the second number
			secNum = sum;//2
			// print sum
			System.out.println(sum);
			//0 1 1 2

		}
		

	}

}
