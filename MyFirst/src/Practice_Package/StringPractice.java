package Practice_Package;

public class StringPractice {

	public static void main(String[] args) {
		String s="madam";
		String s2="madam";
		StringBuilder sb=new StringBuilder(s).reverse();
		
		String s1=new String(sb);
		
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		
		

	}

}
