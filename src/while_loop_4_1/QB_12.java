package while_loop_4_1;

import java.util.Scanner;

public class QB_12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N:");
	int n = sc.nextInt();
	int add =0;
	for(int a=1;a<=n;a++) {
		if(a%2==0){
//			int add =0;
			 add = add +a;
//			 System.out.println(add);
		}
	}
	 System.out.println(add);
}
}
