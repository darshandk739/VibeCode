package CodeProbs;

//missing number in array of 1 to 100
public class Prob11 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5,6, 7, 8, 9,  };
		int f = 10;

		int n = f * (f + 1) / 2;

		int sum = 0;
		for (int c : a) {
			sum += c;
		}

		System.out.println(n-sum);

	}

}
