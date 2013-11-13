
public class Warmup {

	public static void main(String[] args) {
		
		int[][] intArray1 = new int[3][3];
		int[][] intArray2 = new int[3][3];
		int[][] intArray3 = new int[3][3];
		int[][] intArray4 = {  { 3, 2, 5}, {1,9,6}, {7, 8, 4}  };
		int[][] intArray5 = {  { 3, 2, 5}, {1,9,6}, {3, 8, 4}  };
		
		String intArrayString1 = new String(); 
		String intArrayString2 = new String();
		String intArrayString3 = new String(); 
		
		int counter = 1; //Goes from 1 to 9
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
	
				intArray1[i][j] = 1 + (int)(Math.random() * 9);
				intArrayString1 += intArray1[i][j] + " ";
				intArray2[i][j] = 1 + (int)(Math.random() * 9);
				intArrayString2 += intArray2[i][j] + " ";
				intArray3[i][j] = counter;
				intArrayString3 += intArray3[i][j] + " ";
				counter++;
			}
		}
		
		
		if(isOneToNineUnique(intArray1)) {
			System.out.println("Integer Array 1 [" + intArrayString1 + "] is true.");
		} else {
			System.out.println("Integer Array 1 [" + intArrayString1 + "] is false.");
		}
		if(isOneToNineUnique(intArray2)) {
			System.out.println("Integer Array 2 [" + intArrayString2 + "] is true.");
		} else {
			System.out.println("Integer Array 2 [" + intArrayString2 + "] is false.");
		}
		if(isOneToNineUnique(intArray3)) {
			System.out.println("Integer Array 3 [" + intArrayString3 + "] is true.");
		} else {
			System.out.println("Integer Array 3 [" + intArrayString3 + "] is false.");
		}
		if(isOneToNineUnique(intArray4)) {
			System.out.println("Integer Array 4 [3 2 5 1 9 6 7 8 4 ] is true.");
		} else {
			System.out.println("Integer Array 4 [3 2 5 1 9 6 7 8 4 ] is false.");
		}
		if(isOneToNineUnique(intArray5)) {
			System.out.println("Integer Array 5 [3 2 5 1 9 6 3 8 4 ] is true.");
		} else {
			System.out.println("Integer Array 5 [3 2 5 1 9 6 3 8 4 ] is false.");
		}
		
	}
	
	public static boolean isOneToNineUnique(int[][] intArray) {
		
		boolean numDoesExist = true;
		int counter = 1; 
		
		while (numDoesExist) {
			
			for (int i = 0; i < intArray.length; i++) {
				
				for (int j = 0; j < intArray.length; j++) {
					
					if (intArray[i][j] == counter) {
						
						counter++;
						numDoesExist = true;
						j = intArray.length; 
						i = intArray.length; //exit two inner loops
					} else {
						
						numDoesExist = false; 
					}
				}
			}
		}
		
		if (counter == 10) {
			return true;
		} else  {
			return false;
		}
		
	}
}
