package CodeProbs;

import java.util.Scanner;

public class Demo {

	static boolean verify(int age) {
		if (age > 18)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();

		String result = (verify(age)) ? "allowed" : "no way";

		System.out.println(result);

	}
}
