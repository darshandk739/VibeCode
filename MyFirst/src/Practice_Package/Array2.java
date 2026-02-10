package Practice_Package;

import java.util.LinkedList;

public class Array2 {
	public static void main(String[] args) {

		int num[] =new int[] {1,2,3,4,4};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(j);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

			
}