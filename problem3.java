import java.util.ArrayList;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class problem3 {

	public static long number = 600851475143L;
	public static ArrayList<Long> primeFactorsList = new ArrayList<Long>();

	public static void main(String[] args){

		if(isPrime(number)){
			System.out.println("Largest Prime Factor = "+number);
		}
		else{
			System.out.println("Number itself is NOT prime");
			long quotient = number;

			if (quotient % 2 == 0)
				primeFactorsList.add(new Long(2));
			while((quotient % 2 == 0) && (((int) quotient) != 1))
				quotient = (quotient/2); 

			outerloop:
			for(long i=3; i <= (number/2); i+=2){
				if (quotient % i == 0)
					System.out.println("Prime factor "+i+" found");
				primeFactorsList.add(i);
				while((quotient % i == 0) && (((int) quotient) != 1)){
					quotient = (quotient/i);
					if (((int) quotient) == 1) break outerloop;
					//System.out.println("q: " + (quotient));
				}
			}
			
			System.out.println("Largest Prime Factor of "+number+" = "+primeFactorsList.get(primeFactorsList.size()-1));
		}
	}

	public static boolean isXDivisibleByY(long x, long y){
		if (x % y == 0) return true;
		else return false;
	}


	public static boolean isPrime(long i){
		long sqrtI = (long)Math.sqrt((double)i);
		long factor = 2L;
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
