package assessments_qns;
import java.util.Scanner;

public class Search_array {

public static void main(String args[]) {
int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};


int n = arr.length;
int count = 0;

System.out.println("Enter the element to search : ");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();

for (int i=0; i<n; i++)
{
	if (arr[i]==x) 
	{
	 count = 1;
	 break;
	}
	else 
	{
		count=0;
		
	}
}
	if(count == 1)
	{
		System.out.println("The element is present ");
	}
	else
	{
		System.out.println("The element is not present ");
	}
}
}




	