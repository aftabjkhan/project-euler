import java.util.ArrayList;

/**
 * Each new term in the Fibonacci sequence is generated by adding 
 * the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *      1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not 
 * exceed four million, find the sum of the even-valued terms.
 */

public class problem2 {

	public static int maxValue = 4000000;
	public static int sum = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		problem2 p2 = new problem2();
		problem1 p1 = new problem1();
		ArrayList<Integer> fibList = p2.generateFibonacciList(maxValue);
		for(int i=0; i < fibList.size(); i++){
			int currentTerm = fibList.get(i);
			if(p1.isXDivisibleByY(currentTerm,2)){
				sum += currentTerm;
			}
		}
		System.out.println("Sum of Evens = "+ sum);
	}

	public ArrayList<Integer> generateFibonacciList(int maxValue){
		ArrayList<Integer> fibList = new ArrayList<Integer>();
		fibList.add(new Integer(1));
//		System.out.println(fibList.get(0));
		fibList.add(new Integer(2));
//		System.out.println(fibList.get(1));
		int index = 1;
		int nextTerm = 3;
		while(nextTerm <= maxValue){
			nextTerm = fibList.get(index)+fibList.get(index-1);
			if (nextTerm <= maxValue){
				fibList.add(nextTerm);
//				System.out.println(nextTerm);
			}
			index++;
		}
		return fibList;
	}
	
	
}
