
/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 */



public class problem5 {

	static int number = 0;

	static int minDivisor = 2;
	static int maxDivisor = 20;



	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean isDivisibleByAll = false;

		while(isDivisibleByAll == false){
			
			number += 2;
			//System.out.println("Current Number: " + number);
			
			isDivisibleByAll = true;
			int dividend = number;

			for(int divisor = minDivisor; divisor <= maxDivisor; divisor++){

				if(!isDivisible(dividend, divisor)){
					isDivisibleByAll = false;
					//System.out.println("False. Is not divisible by: " + divisor);
					break;
				}
			}
		}

		System.out.println("Smallest Number Divisible By " + minDivisor + " - " + maxDivisor + " is: " + number);
	}



	private static boolean isDivisible(int dividend, int divisor) {
		if (dividend % divisor == 0) return true;
		else return false;
	}

}