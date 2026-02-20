package CodeProbs;

public class Prob1 {
	public static void main(String[] args) {

		
		//Reverse String
		//Check if String is Palindrome
		// using string builder
		String s = "reverse me";
		int i;

		char[] c = new char[s.length()];
		c = s.toCharArray();
		int j = c.length - 1;
		char[] newc = new char[c.length];
		for (i = 0; i < c.length; i++) {

			newc[i] = c[j];
			j--;
		}

		System.out.println(newc);
		
//		
//		StringBuilder sb=new StringBuilder(s);
//		System.out.println(sb.reverse());
		
	
	}
}
