package Project01;

public class Problem03 {

	public static void main(String[] args) {

		
		int sum = 0;
		int [][] numbers = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		for(int index=0; index<numbers.length; index++) {
			for(int index2=0; index2<numbers[index].length ; index2++) {
				sum = sum + numbers[index][index2];	
				}
		}
			
		System.out.println(sum);
	}
}	
		
		
		
		
	
