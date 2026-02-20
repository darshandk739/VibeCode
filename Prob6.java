package CodeProbs;

import java.util.Iterator;

public class Prob6 {
//Reverse words in a sentece
	public static void main(String[] args) {
		String s = "hello this is darshan";
		String ss[] = s.trim().split("\\s+");

		StringBuilder sb = new StringBuilder();
		for (int i = ss.length - 1; i >= 0; i--) {
			sb.append(ss[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}

		System.out.println(sb.toString());

		
		

	}
}
