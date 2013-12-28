import java.math.BigInteger;

/**
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * 
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */


public class problem48 {
	
	static BigInteger sum = BigInteger.ZERO;
	static int minValue = 1;
	static int maxValue = 1000;
	static int numberOfEndChars = 10;
	
	public static void main(String[] args){
		
		for (BigInteger i = BigInteger.valueOf(minValue); 
				BigInteger.valueOf(maxValue).compareTo(i) > -1;
				i = i.add(BigInteger.ONE)){
			//BigInteger currentValue = i.pow(i.intValue());
			//System.out.println(currentValue.toString());
			sum = sum.add(i.pow(i.intValue()));
		}
		
		String sumString = sum.toString();
		
		String lastXChars = sumString.substring(sumString.length() - numberOfEndChars);
		
		System.out.println("The last 10 chars are: " + lastXChars);
		
	}

}
