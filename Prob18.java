package CodeProbs;

//Rotate array by k position
public class Prob18 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		int n = 2;

		for (int i = 0; i < n; i++) {
			int f = a[0], j;

			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];

			}
			a[j] = f;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
