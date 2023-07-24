package assessments_qns;

import java.util.Scanner;

public class Income_tax {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the income :");
		double income = sc.nextDouble();
		
		if(income>=0 && income<=180000) {
			System.out.println("Tax payable : Nil");
		}
		else if(income>=181001 && income<=300000)
		{
			double tax = 0.1*income;
			System.out.println("Slab b Tax payable: "+tax);
		}
		else if(income>=300001 && income<=500000)
		{
			double tax = 0.2*income;
			System.out.println("Slab c"+"Tax payable: "+tax);
		}
		else if(income>=500001 && income<=1000000) {
			double tax = 0.3*income;
			System.out.println("Slab c"+"Tax payable: "+tax);
		}
	}
	
}


