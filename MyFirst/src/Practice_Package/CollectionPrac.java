package Practice_Package;

import java.util.ArrayList;

public class CollectionPrac {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		al.stream().filter(x -> x > 2).map(x -> x / 2).forEach(x -> System.out.println(x));

		// forEach(x -> System.out.println(x));

	}

}
