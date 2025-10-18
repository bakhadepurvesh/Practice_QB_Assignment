package while_loop_4_1;

import java.util.Scanner;

public class QB_14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=sc.nextInt();
	// number input 
	
	int count = 0;
	
	while(num!=0){
		num =num/10;
		count++;
	}
	System.out.println(count);
}
}
