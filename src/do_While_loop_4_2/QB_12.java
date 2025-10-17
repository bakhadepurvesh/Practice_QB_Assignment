package do_While_loop_4_2;

import java.util.Scanner;

public class QB_12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n ");
	int n = sc.nextInt();
	int count = 0;
	for(int a=2;a<=n;a++) {
		if(a%2==0){
			count = count+a;
		}
	}
	System.out.println(count);
}
}
