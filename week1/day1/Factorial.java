package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// the product of all the integers from 1 to that number.
		// 5 = 5*4*3*2*1 = 120
		// Declare your input as 5
		int input = 5;
		// Declare an integer variable fact as 1
		int fact =1;
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <=input; i++) {
			//i=5
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact= fact*i;
			//24*5=120
			//fact =120
		}
		System.out.println("The factorial of 5 : "+fact);
	}

}
