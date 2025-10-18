package while_loop_4_1;

import java.util.Scanner;

public class QB_4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	
	for(num =1;num<=50;num++) {
		while(num%2==1){
			System.out.println("Odd No:"+num);
			num++;
		}
	}
	
	
}
}
