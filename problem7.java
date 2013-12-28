import java.util.ArrayList;


/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 */


public class problem7 {
	
	public static ArrayList<Integer> primesList = new ArrayList<Integer>(1);
	public static int cardinalityOfDesiredPrime = 10001;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		primesList.add(2);
		int currentInt = 3;
		
		while(primesList.size() < cardinalityOfDesiredPrime){
			if(isPrime(currentInt)){
				primesList.add(currentInt);
			}
			currentInt++;
		}
		
		System.out.println("The " + cardinalityOfDesiredPrime + "th prime number is " + primesList.get(primesList.size()-1));
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
		if(i==1){
			isPrime = false;
		}
		return isPrime;
	}
}
