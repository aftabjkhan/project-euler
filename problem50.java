import java.util.ArrayList;

/**
 * The prime 41, can be written as the sum of six consecutive primes:
 * 			41 = 2 + 3 + 5 + 7 + 11 + 13
 * 
 * This is the longest sum of consecutive primes that adds to a prime below one-hundred.
 * 
 * The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
 * 
 * Which prime, below one-million, can be written as the sum of the most consecutive primes?
 * 
 */


public class problem50 {

	private static final int maxValue = 1000000;
	private static ArrayList<Integer> primesList;
	private static int largestPrime;


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		primesList = generatePrimesList(maxValue);
		largestPrime = getLargestPrimeSumOfConsecutivePrimes();
		System.out.println("Largest Prime: "+largestPrime);
	}


	public static int getLargestPrimeSumOfConsecutivePrimes(){
		int largestNumTerms = 0;
		int largestPrime = 0;
		for(int i=0; i<primesList.size(); i++){
			int total = primesList.get(i);
			int numTerms = 1;
			for(int j=i+1; j<primesList.size(); j++){
				total += (int) primesList.get(j);
				numTerms++;
				
				if (total > maxValue)
					break;
				
				if((total<maxValue) && isPrime(total) && (numTerms>largestNumTerms)){
					largestPrime = total;
					largestNumTerms = numTerms;
				}

			}
		}
		return largestPrime;
	}



	public static ArrayList<Integer> generatePrimesList(int maxValue) {
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		int currentValue = 2;
		while (currentValue < maxValue){
			if (isPrime(currentValue)){
				primesList.add(new Integer(currentValue));
			}
			currentValue++;
		}
		return primesList;
	}


	public static boolean isPrime(int i){
		int sqrtI = (int)Math.sqrt((double)i);
		int factor = 2;
		boolean isPrime = true;
		while((factor <= sqrtI) && isPrime){
			if ((i % factor) == 0 ){
				isPrime = false;
			}
			factor++;
		}
		return isPrime;
	}
}
