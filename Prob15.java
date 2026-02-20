package CodeProbs;

//all pairs that sum to a given number
public class Prob15 {
	public static void main(String[] args) {

		int target = 10;
		int[] a = { 1, 9, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) { // Start from i+1 to avoid duplicates
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + " + " + a[j] + " = " + target);
				}
			}
		}
	}

}
