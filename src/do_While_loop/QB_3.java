package do_While_loop;

import java.util.Scanner;

public class QB_3 {
	public static void main(String[]args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("print number:");
//		int a =sc.nextInt();
//		for(int i = 2;i<=50;i++) {
//			do { 
//				System.out.println(i);
//				i++;
//			}while(i%2==0);
//		}
	   int b = 2;
       do {
    		   System.out.println(b);
    		   b+=2;
//    	  else {
//    		  b++;
//    		  continue;
//    	  }
       }
       while(b<=50 && b%2==0);	
//       b++;
	}
}
