/**
 * A palindromic number reads the same both ways. The largest 
 * palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers. 
 */

public class problem4 {

	public static int largestPalindrome = 0;

	public static int minValue = 100;
	public static int maxValue = 999;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i=minValue; i <= maxValue; i++){
			for(int j=minValue; j <=maxValue; j++){

				int currentProduct = i*j;

				if(isPalindrome(currentProduct) && largestPalindrome < currentProduct){
					largestPalindrome = currentProduct;

				}
			}
		}

		System.out.println("Largest Integer Found: " + largestPalindrome);
	}



	/**
	 * Determines whether the argument integer is a palindrome
	 * @param number
	 * @return boolean whether or not input number is a palindrome
	 */

	private static boolean isPalindrome(int number) {

		String productString = Integer.toString(number);
		char[] charArray = new char[productString.length()];
		productString.getChars(0, productString.length(), charArray, 0);

		int indexFromBegining = 0;
		int indexFromEnd = productString.length()-1;
		boolean isPalindrome = true;

		while(indexFromBegining < indexFromEnd && isPalindrome == true){
			if(charArray[indexFromBegining] == charArray[indexFromEnd]){
				indexFromBegining++;
				indexFromEnd--;
			}else{
				isPalindrome = false;
			}
		}

		return isPalindrome;
	}

}
