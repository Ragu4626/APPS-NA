package assessments_qns;
import java.util.Scanner;

public class ArmstrongNumber {

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
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(isArmstrong(n)) {
			System.out.println("The number is an armstrong number");
		}
		else {
			System.out.println("The number is not an armstrong number");
		}
	}
	
}
