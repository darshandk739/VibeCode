package CodeProbs;

import java.util.HashMap;

//first non-repeated character in a string
public class Prob8 {
	public static void main(String[] args) {
		String str = "fffffahash";

		// Step 1: Count frequency of each character
		HashMap<Character, Integer> charCount = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		char n = 0;
		// Step 2: Find first character with count = 1
		for (char c : str.toCharArray()) {
			if (charCount.get(c) == 1) {
				n = c;
			}
		}
		System.out.println(n);
	}

}
