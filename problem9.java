
/**
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 * 		a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * 
 */

public class problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 0;
		int productABC = 0;
		
		for(a=1; a<1000; a++){
			for(b=1; b<1000; b++){
				
				int currentSum = (int) (Math.pow(a, 2) + Math.pow(b, 2));
				double currentCValue = Math.sqrt(currentSum);
				
				if (Math.ceil(currentCValue) == currentCValue){
					
					c = (int) currentCValue;
					
					if(a+b+c==1000){
						System.out.println("Answer Found!");
						productABC = a*b*c;
					}
				}					
			}
		}
		
		System.out.println("The Product ABC where A+B+C=1000 is: " + productABC);
	}
	
}
