

/**
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 		1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 		(1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten 
 * natural numbers and the square of the sum is 3025  385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one 
 * hundred natural numbers and the square of the sum.
 * 
 * 
 */


public class problem6 {

	
	public static int[] numbers;
	public static int rangeStart = 1;
	public static int rangeEnd = 100;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		numbers = new int[(rangeEnd - rangeStart + 1)];
		for(int i=0; i < numbers.length; i++){
			numbers[i] = i + rangeStart;
		}
		
		int sumOfSq = sumOfSquares(numbers);
		System.out.println("Sum of Squares from " + rangeStart + " to " + rangeEnd + " = " + sumOfSq);
		
		int sqOfSum = squareOfSum(numbers);
		System.out.println("Square of Sum from " + rangeStart + " to " + rangeEnd + " = " + sqOfSum);
		
		int difference = Math.abs(sumOfSq - sqOfSum);
		System.out.println("Difference between Sum of Sq and Sq of Sum = " + difference);
		
	}
	
	
	private static int squareOfSum(int[] numbers2) {
		int sum = 0;
		for(int i=0; i < numbers.length; i++){
			sum += numbers[i];
		}
		return (int) Math.pow(sum, 2);
	}


	private static int sumOfSquares(int[] numbers){
		int sum = 0;		
		for(int i=0; i < numbers.length; i++){
			sum += (int) Math.pow(numbers[i], 2);
		}
		return sum;
	}
	
	
	
	
}
