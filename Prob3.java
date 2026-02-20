package CodeProbs;

import java.util.HashMap;

public class Prob3 {
	public static void main(String[] args) {
// Count frequency in a string

		String s = "ggggg";
		char[] c = s.toCharArray();

		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		for (char ch : c) {
			if (h.containsKey(ch)) {
				h.put(ch, h.getOrDefault(ch, 0) + 1);
			} else {
				h.put(ch, 1);
			}
		}
		
		System.out.println(h);
	}
}
