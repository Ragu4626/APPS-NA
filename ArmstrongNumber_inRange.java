package assessments_qns;

import java.util.Scanner;

public class ArmstrongNumber_inRange {
	public static boolean isArmstrong(int n)
	{
		int temp=0, digit=0,last=0,sum=0;
		temp=n;
		
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0)
		{
			last = temp%10;
			sum += (Math.pow(last, digit));
			temp=temp/10;
		}
		
		if(n==sum) {
			return true;
		}
		else 
		return false;
	}
	
	public static void main(String args[]) {

		for(int i=100;i<900;i++) {
			if(isArmstrong(i))
				System.out.print(i+",");
		}
	}
}
