package Practice_Package;



public class ArrayPractice {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 33, 3, 3, 87, 22,22 };
		int i, j = 0;

		int[] duplicate = new int[array.length];

		for (i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				duplicate[j] = array[i];
				j++;
			}

		}
		
		for(int dup: duplicate)
		{
			System.out.println(dup);
		}
		
		
		

	}

}
