package CodeProbs;

public class Prob7 {
	// reverse individual words in a sentence

	public static String reverse(String s) {
		StringBuilder ss = new StringBuilder(s);
		return ss.reverse().toString();

	}

	public static void main(String[] args) {

		String s = "hello this is darshan";
		String str[] = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			String rev = reverse(str[i]);
			sb.append(rev);

			if (i < str.length) {
				sb.append(" ");
			}

		}

		System.out.println(sb.toString());

	}
}
