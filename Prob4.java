package CodeProbs;

import java.util.HashSet;
import java.util.Set;

public class Prob4 {

	// remove duplicates
	public static void main(String[] args) {
		String s = "uupplicaaaaates";

//	String ss=s.chars().distinct().collect(StringBuilder:: new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
//
//
//
//System.out.println(ss);
		StringBuilder sb = new StringBuilder();

		Set<Character> l = new HashSet();

		for (char c : s.toCharArray()) {
			l.add(c);
		}

		for (char c : l) {
			sb.append(c);
		}

		System.out.println(sb);
	}
}
