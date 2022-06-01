package Project01;

public class Problem05 {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 0 },
				{10,11,12, 0, 0 } };

int sumeven = 0;
int sumodd = 0;
for (int i = 0; i < num.length; i++) {
	for (int j = 0; j < num[i].length; j++) {
		if (num[i][j] % 2 == 0)
			sumeven+=num[i][j]; }
}	System.out.println("The sum of even Numbers is "+ sumeven);
		
		
		
		
		
		
		
		
		
	}

}
