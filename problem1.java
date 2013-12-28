
/** 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class problem1 {

	public int sum = 0;
	public int maxValue = 1000;

	public static void main(String[] args){
		problem1 p1 = new problem1();
		for(int i=0; i<p1.maxValue; i++){
			if((p1.isXDivisibleByY(i,3) || p1.isXDivisibleByY(i,5))){
				p1.sum += i;
			}
		}
		System.out.println("Answer = "+ p1.sum);
	}

	public boolean isXDivisibleByY(int x, int y){
		if (x % y == 0) return true;
		else return false;
	}
}
