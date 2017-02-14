package problems;

public class Topcoder1 {

	public static void main(String[] args) {

		String initialString = "BBBBABABBBBBBA";
		String target = "BBBBABABBABBBBBBABABBBBBBBBABAABBBAA";
		
		String result = changeToTarget(initialString, target);
		
		System.out.println("Initial String::" + initialString);
		System.out.println("Target String::" + target);
		System.out.println(result);
		
	}

	public static String changeToTarget(String initialString, String target) {
		
		
		if (initialString.length() <= target.length()) {
			initialString = addString(initialString, "A");
			
			if (checkForPossibleString(initialString, target) == true)
				return "Possible";
			else
				initialString = reverseString(initialString);

			if (checkForPossibleString(initialString, target) == true)
				return "Possible";
			else
				initialString = addString(initialString, "B");
			
			if (checkForPossibleString(initialString, target) == true)
				return "Possible";
			else {
				return changeToTarget(initialString, target);
			}

		}
		return "Impossible";
	}

	public static boolean checkForPossibleString(String initialString, String target) {
		
		if (initialString.equals(target))
			return true;
		else
			return false;
	}

	public static String addString(String initialString, String toAdd) {

		initialString = initialString + toAdd;
		return initialString;
	}

	public static String reverseString(String initialString) {

		String tempString = "";
		int length = initialString.length();
		for (int i = length - 1; i >= 0; i--) {
			tempString += initialString.charAt(i);
		}

		initialString = tempString;
		return initialString;
	}

}
