import java.util.HashMap;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */

public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		
		System.out.println("natalie");
	}
	
	public static String main(String arg) {
		
		return "Overloaded main method was passed \"" + arg + "\".";
	}
	
	public static double divide(double a, double b) {
		
		return a/b;
	}
	
	public static int divide(int a, int b) {
		
		return a/b;
	}
	
	public static boolean isDivisibleBy7(int a) {
		
		boolean divisible = false;
		
		if (a % 7 == 0)
			
			divisible = true;
		
		return divisible;
	}
	
	public static int findMin(int a, int b, int c) {
		
		return Math.min(Math.min(a,b), c);	
	}
	
	public static int findMin(int [] array) {
		
		int minValue = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < minValue) {
				
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	public static double average(int[] array) {
		
		double count = 0;
		
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
			
			count += 1;
		}
		return sum/count;
	}
	
	public static String[] toLowerCase(String[] strings) {
		
		
		for (int i = 0; i < strings.length; i++) {
			
			strings[i] = strings[i].toLowerCase();
		}
		return strings;
	}
	
	public static String[] toLowerCaseCopy(String[] strings) {
		
		String [] newArray = strings.clone();
		
		for (int i = 0; i < newArray.length; i++) {
			
			newArray[i] = newArray[i].toLowerCase();	
			
			}
		
		return newArray;
		
	}
	
	public static void removeDuplicates(int[] array) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < array.length; i++) {
		
			if (map.containsKey(array[i]))
				
				map.put(array[i], map.get(array[i]) + 1);
				
			 else 
	
				map.put(array[i], 1);
			
			}
		
		for (int i = 0; i < array.length; i++) {
			
			int count = map.get(array[i]);
					
					if (count > 1)
						
						array[i] = 0;
		}
		}
}
