package assessments_qns;

import java.util.Scanner;

public class SimpleAndCompound_Interest {
	public static void main(String args[]) {
		double p, n, r, si, ci;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amount: ");
	p = sc.nextDouble();
	System.out.println("Enter the no.of years: ");
	n = sc.nextDouble();
	System.out.println("Enter the rate of interest: ");
	r = sc.nextDouble();
	
	si=(p*n*r)/100;
	ci=p*Math.pow(1+r/100, r)-p;
	System.out.println("Simple Interest : "+si);
	System.out.println("Compound Interest : "+ci);
	}
}
