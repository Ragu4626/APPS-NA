package assessments_qns;
import java.util.Scanner;

public class CUI_login {
	public static void main(String args[]) {
		String correctUsername = "Ram";
		String correctPassword = "abcde";
		int maxAttempts = 3;
		int attempts = 0; 
		
		Scanner sc = new Scanner(System.in);
		while(attempts < maxAttempts){
			System.out.println("Enter your username: ");
			String username = sc.next();
			
			System.out.println("Enter the password: ");
			String password = sc.next();
			
			if(username.equals(correctUsername) && password.equals(correctPassword)){
				System.out.println("Welcome " + username );
				break;
			}
			else {
				attempts++;
				System.out.println("Invalid username or password. Please try again");
			}
		}
		if(attempts == maxAttempts) {
			System.out.println("Contact admin");
		}
		
		sc.close();
	}

}
