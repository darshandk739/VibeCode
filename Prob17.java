package CodeProbs;

//move all zeroes to end of array
public class Prob17 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0, 0, 4, 5, 3 };

		 int nonZeroIndex = 0;  // Position for next non-zero element
	        
	        // Move all non-zero elements to the front
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[nonZeroIndex] = nums[i];
	                nonZeroIndex++;
	            }
	        }
	        
	        // Fill remaining positions with zeros
	        for (int i = nonZeroIndex; i < nums.length; i++) {
	            nums[i] = 0;
	        }
	        
	        
	        
	        for(int c: nums)
	        {
	        	System.out.println(c);
	        }

	}
}
