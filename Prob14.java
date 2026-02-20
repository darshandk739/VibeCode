package CodeProbs;

//reverse array
public class Prob14 {
	public static void main(String[] args) {

		int[] a = { 324, 66, 4, 5, 6, 7, 68, 9 };
		int temp,i = 0;
		int j = a.length - 1;
		for (i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;

		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}