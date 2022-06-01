package Project01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		System.out.println("----------Task2----------");
		
		System.out.println("Enter the numbers of elements in array");
			int num=in.nextInt();
			String [] countries=new String[num];
				
				System.out.println("Enter the name of the countries");
				String capital="null";
				in.nextLine();
				for(int i=0; i<num;i++) {
					countries[i]=in.nextLine();
				}
				
					switch (countries[i]) {
					case "Ukraine":
						capital="Kyiv";
						break;
					case "Poland":
						capital="Warszawa";
						break;
					case "USA":
						capital="Washington";
						break;
						default:
							capital ="Unknown";
					}
					System.out.println(countries[i]+":"+capital);
					
					
		System.out.println("-------------------------------------");
			
		
int num1 = 3;
		
		Scanner inp=new Scanner(System.in);
		String [][]country = {
				
				{"Afghanistan”, “USA”, “Turkey"},
				{"Kabul”, “Washington”, “Istanbul"}
		};
		for (int row=0; row<country.length; row++) {
			for (int col=0; col<country[row].length; col++) {
				System.out.println(country[row][col]+" ");
			}
			System.out.println();
		}
					
	}
}
