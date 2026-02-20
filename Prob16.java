package CodeProbs;

import java.util.Arrays;

//reove unique elements from sorted array
public class Prob16 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };

//		int newa[]=Arrays.stream(a).distinct().toArray();

//		for(int c: newa)
//		{
//			System.out.println(c);
//		}

		int index = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[index]) {
				index++;
				a[index] = a[i];
			}
		}

		for (int i = 0; i < index; i++) {
			System.out.println(a[i]);
		}

	}
}
