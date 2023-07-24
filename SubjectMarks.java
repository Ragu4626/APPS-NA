package assessments_qns;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String args[]) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter subject 1 title : ");
	String sub1 = sc.next();
	System.out.println("Enter subject 1 mark : ");
	int mark1 = sc.nextInt();
	System.out.println("Enter subject 2 title : ");
	String sub2 = sc.next();
	System.out.println("Enter subject 2 mark : ");
	int mark2 = sc.nextInt();
	System.out.println("Enter subject 3 title : ");
	String sub3 = sc.next();
	System.out.println("Enter subject 2 mark : ");
	int mark3 = sc.nextInt();
	
	if(mark1>60  && mark2>60 && mark3>60) {
		System.out.println("Passed");
	}
	else if((mark1>60)&&(mark2>60)&&(mark3<60) || (mark1>60)&&(mark3>60)&&(mark2<60) || (mark1<60)&&(mark2>60)&&(mark3>60)){
		System.out.println("Promoted");
	}
	
	else
	{
		System.out.println("failed");
	}
	}
	
}

