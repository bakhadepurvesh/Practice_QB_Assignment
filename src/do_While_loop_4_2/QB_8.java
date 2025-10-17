package do_While_loop_4_2;

import java.util.Scanner;

public class QB_8 {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
	int n = sc.nextInt();
//	int number= 1;
//	do {
//		if(number%5==0){
//			number++;
//		}
//		else {
//			System.out.println(number);
//			number++;
//			continue;
//		}
//	}while(number<=n);
	
	for(int v=1;v<=n;v++){
		if(v%5==0){
			continue;
		}
		else {
		  System.out.println(v);
		}
	}
}
}
