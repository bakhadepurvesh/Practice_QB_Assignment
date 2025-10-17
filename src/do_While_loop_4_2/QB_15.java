package do_While_loop_4_2;

import java.util.Scanner;

//import java.util.Scanner;

public class QB_15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter n");
	int n= sc.nextInt();
	int sum =0;
	while(n!=0){
		
    int digit = n%10 ;//  get last digits
		sum +=digit;
		n /=10;   // remove last digit
	}
	System.out.println(sum);
}
}
