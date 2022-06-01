package Project01;

public class Problem09 {

	public static void main(String[] args) {

		
	int[] num= {3, 10, 11, 12, 13};
	
	int max=num[0];
	
	for(int i=0; i<num.length; i++) {
		if(num[i]>max)
			max=num[i];
	}
	
		System.out.println(max);
		
		
	System.out.println();	
		
		
	int min=num[0];
	for(int j=0; j>num.length; j++) {
		if(num[j]<min)
			min=num[j];
	}
		
		System.out.println(min);
		
	}

}
