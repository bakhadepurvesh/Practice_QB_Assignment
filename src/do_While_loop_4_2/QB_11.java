package do_While_loop_4_2;

import java.util.Scanner;

public class QB_11 {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n:");
	int number = sc.nextInt();
	int count =0;
	 for(int a =1;a<=number;a++){
		 count = count+a;
	 } 
	 System.out.println(count);
			
}

}
