package do_While_loop;
import java.util.Scanner;
public class QB_9 {
	
	public static void main(String[]args){
	int number = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = sc.nextInt();

	do{
	  System.out.println(number);
	  number++;
	} while(n>=number);

	}	
}

