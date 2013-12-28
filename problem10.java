
/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 */

public class problem10 {
	
	public static int maxValue = 2000000;
	public static long sum = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i=1; i<maxValue; i++){
			if(problem7.isPrime(i)){
				sum += i;
			}
		}
		
		System.out.println("Sum of all primes less than "+maxValue+" = " + sum);

	}

}
