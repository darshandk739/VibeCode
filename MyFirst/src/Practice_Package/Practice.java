package Practice_Package;

public class Practice {
	int u = 9;

	public void vro() {
		int z = 4;
	}

	public static void Lo() {
		int i = 5;
		System.out.println("do method");
	}

	public static void main(String[] args) {
		System.out.println("hello universe");
//		Practice.Lo();
//		
		Practice p = new Practice();
		p = null;
//	      	p.vro();
//		 System.out.println(u);
//		 System.out.println();
		try {
			System.out.println(p.u);
		} catch (Exception exc) {
			System.out.println("gotcha");
		}
	}
}
