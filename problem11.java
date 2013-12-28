
/**
 * In the 20x20 grid below, four numbers along a diagonal line have been marked in red.
 * 
 * 08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
 * 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
 * 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
 * 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
 * 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
 * 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
 * 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
 * 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
 * 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
 * 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
 * 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
 * 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
 * 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
 * 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
 * 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
 * 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
 * 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
 * 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
 * 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
 * 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
 * 
 * What is the greatest product of four adjacent numbers in 
 * any direction (up, down, left, right, or diagonally) in the 2020 grid?
 * 
 */

public class problem11 {

	public static String line0 = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08";
	public static String line1 = "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00";
	public static String line2 = "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65";
	public static String line3 = "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91";
	public static String line4 = "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80";
	public static String line5 = "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50";
	public static String line6 = "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70";
	public static String line7 = "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21";
	public static String line8 = "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72";
	public static String line9 = "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95";
	public static String line10 = "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92";
	public static String line11 = "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57";
	public static String line12 = "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58";
	public static String line13 = "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40";
	public static String line14 = "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66";
	public static String line15 = "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69";
	public static String line16 = "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36";
	public static String line17 = "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16";
	public static String line18 = "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54";
	public static String line19 = "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

	static int numRows = 20;
	static int numColumns = 20;

	static int greatestProduct = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String delimiter = "\\s";

		/*
		int[] intline0 = splitIntList(line0, delimiter);
		int[] intline1 = splitIntList(line1, delimiter);
		int[] intline2 = splitIntList(line2, delimiter);
		int[] intline3 = splitIntList(line3, delimiter);
		int[] intline4 = splitIntList(line4, delimiter);
		int[] intline5 = splitIntList(line5, delimiter);
		int[] intline6 = splitIntList(line6, delimiter);
		int[] intline7 = splitIntList(line7, delimiter);
		int[] intline8 = splitIntList(line8, delimiter);
		int[] intline9 = splitIntList(line9, delimiter);
		int[] intline10 = splitIntList(line10, delimiter);
		int[] intline11 = splitIntList(line11, delimiter);
		int[] intline12 = splitIntList(line12, delimiter);
		int[] intline13 = splitIntList(line13, delimiter);
		int[] intline14 = splitIntList(line14, delimiter);
		int[] intline15 = splitIntList(line15, delimiter);
		int[] intline16 = splitIntList(line16, delimiter);
		int[] intline17 = splitIntList(line17, delimiter);
		int[] intline18 = splitIntList(line18, delimiter);
		int[] intline19 = splitIntList(line19, delimiter);
		 */

		int[][] intGrid = new int[numRows][];

		intGrid[0] = splitIntList(line0, delimiter);
		intGrid[1] = splitIntList(line1, delimiter);
		intGrid[2] = splitIntList(line2, delimiter);
		intGrid[3] = splitIntList(line3, delimiter);
		intGrid[4] = splitIntList(line4, delimiter);
		intGrid[5] = splitIntList(line5, delimiter);
		intGrid[6] = splitIntList(line6, delimiter);
		intGrid[7] = splitIntList(line7, delimiter);
		intGrid[8] = splitIntList(line8, delimiter);
		intGrid[9] = splitIntList(line9, delimiter);
		intGrid[10] = splitIntList(line10, delimiter);
		intGrid[11] = splitIntList(line11, delimiter);
		intGrid[12] = splitIntList(line12, delimiter);
		intGrid[13] = splitIntList(line13, delimiter);
		intGrid[14] = splitIntList(line14, delimiter);
		intGrid[15] = splitIntList(line15, delimiter);
		intGrid[16] = splitIntList(line16, delimiter);
		intGrid[17] = splitIntList(line17, delimiter);
		intGrid[18] = splitIntList(line18, delimiter);
		intGrid[19] = splitIntList(line19, delimiter);

		//check rows
		for(int i=0; i<numRows; i++){
			for(int j=0; j<=(numColumns-4); j++){

				int value0 = intGrid[i][j];
				int value1 = intGrid[i][j+1];
				int value2 = intGrid[i][j+2];
				int value3 = intGrid[i][j+3];
				//System.out.println("Current Values: "+ value0 +", "+ value1 +", "+ value2 +", "+ value3);
				int currentProduct = value0*value1*value2*value3; 
				if (currentProduct > greatestProduct){
					greatestProduct = currentProduct;
				}

			}
		}

		//check columns
		for(int j=0; j<numColumns; j++){
			for(int i=0; i<=(numRows-4); i++){

				int value0 = intGrid[i][j];
				int value1 = intGrid[i+1][j];
				int value2 = intGrid[i+2][j];
				int value3 = intGrid[i+3][j];
				//System.out.println("Current Values: "+ value0 +", "+ value1 +", "+ value2 +", "+ value3);
				int currentProduct = value0*value1*value2*value3; 
				if (currentProduct > greatestProduct){
					greatestProduct = currentProduct;
				}

			}
		}

		//check diagonal (top-left to bottom-right)
		for(int i=0; i<=(numRows-4); i++){
			for(int j=0; j<=(numColumns-4); j++){

				int value0 = intGrid[i][j];
				int value1 = intGrid[i+1][j+1];
				int value2 = intGrid[i+2][j+2];
				int value3 = intGrid[i+3][j+3];
				//System.out.println("Current Values: "+ value0 +", "+ value1 +", "+ value2 +", "+ value3);
				int currentProduct = value0*value1*value2*value3; 
				if (currentProduct > greatestProduct){
					greatestProduct = currentProduct;
				}

			}
		}

		//check diagonal (top-right to bottom-left)
		for(int i=0; i<=(numRows-4); i++){
			for(int j=0; j<=(numColumns-4); j++){

				int value0 = intGrid[i][j+3];
				int value1 = intGrid[i+1][j+2];
				int value2 = intGrid[i+2][j+1];
				int value3 = intGrid[i+3][j];
				// System.out.println("Current Values: "+ value0 +", "+ value1 +", "+ value2 +", "+ value3);
				int currentProduct = value0*value1*value2*value3; 
				if (currentProduct > greatestProduct){
					greatestProduct = currentProduct;
				}

			}
		}
		
		System.out.println("Greatest product: " + greatestProduct);
	}


	/**
	 * Splits each string line of integers into an integer array
	 * @param intList - list of integers in string form
	 * @param delimiter - regex character used to separate integer values
	 * @return returns integer array containing list values
	 */
	public static int[] splitIntList(String intList, String delimiter){
		String[] temp = intList.split(delimiter);
		int[] intArray = new int[temp.length];

		for(int i=0; i<temp.length; i++){
			intArray[i] = Integer.parseInt(temp[i]);
		}
		return intArray;
	}

}
