package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {
	
	public static int lengthRequirement(int minAmount, String[] x) {
		int j = x.length - 1;
		int rating = 0;
		for (int i = 0; i < x.length; i = i + 1) {
			if (x[j].length() < minAmount || Help(x[j]).equals("y"))
				rating++;
			j--;
		}
		return rating;
	}
	
	static String Help(String passedString) {
		int count = -1;
		while (count++ < passedString.length() - 1) {
			char currChar = passedString.charAt(count);

			if (!(currChar >= 'a' && currChar <= 'z' || currChar >= 'A' && currChar <= 'Z'))
				return "n";
		}
		return "y";
	}
	


}
