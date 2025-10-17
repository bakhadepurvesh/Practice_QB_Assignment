package If_Else_3_1;

import java.util.Scanner;

public class QB_17 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the userName :");
	String userName =sc.next();
	System.out.println("Enter the password :");
	String passWord =sc.next();
	 String name ="Suyash";
	 String pass ="Suyash@123";
	
	if(name.contains(userName) && pass.contains(passWord)){
		System.out.println("Access Granted");
	}
	else {
		System.out.println("Denied");
	}
}

}
//Login Authentication
//Input username and password.
//If both match predefined values (hardcoded), print "Access Granted", else "Denied".