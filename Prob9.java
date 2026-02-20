package CodeProbs;

public class Prob9 {
	public static boolean isDigit(String s) {
		char[] c = s.toCharArray();

		for (char q : c) {
			if (!Character.isDigit(q)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String s = "14323";
		System.out.println(isDigit(s));

	}
}
