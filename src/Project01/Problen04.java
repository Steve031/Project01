package Project01;

public class Problen04 {

	public static void main(String[] args) {

		
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 *  Develop a program which will identify/print the even numbers only.
		 */
int[][] nums = {
        		{0, 17, 24, 38},
        		{52, 4, 6, 71},
        		{8, 9, 10, 11}   };
        for (int i = 0; i < nums.length; i++) {
        	for (int j = 0; j < nums[i].length; j++) {
        		if(nums[i][j] %2==0) {
        			System.out.print(nums[i][j] + " ");
        		}
        }
    	   }
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
