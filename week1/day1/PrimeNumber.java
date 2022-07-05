package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		//a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
		//2*1=2    13*1 =13
		//1*2=2    1*13 =13

		// Declare an int Input and assign a value 13
		int input = 14;
		// Declare a boolean variable flag as false
		boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= input/2; i++) {
			// 2 3 4 5 6 7  
			if (input%i==0) {
			//14%2=0
				//14/2=7
				// Set the flag as true when there is no remainder
				flag = true;
				// break the iterator	
				break;

			}
		}
		if (flag) {
			// Print 'Not a Prime' when the condition doesn't match 
			System.out.println("Not a Prime");
		}else {
			// Print 'Prime' when the condition matches
			System.out.println("Prime");
		}

	}

}
