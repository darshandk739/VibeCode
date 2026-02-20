package CodeProbs;

//merge two sorted arrays
public class Prob19 {
	public static void main(String[] args) {

		int[] a1 = { 0, 1, 2, 3, 4 };
		int[] a2 = { 5, 6, 7, 8, 9 };

		int[] a = new int[a1.length + a2.length];
		int k = 0;

		for (int i = 0; i < a.length / 2; i++) {
			a[i] = a1[i];

		}
		for (int j = a.length / 2; j < a.length; j++) {
			a[j] = a2[k];
			k++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
