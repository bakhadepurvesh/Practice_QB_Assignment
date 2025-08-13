package do_While_loop;

import java.util.Scanner;

public class QB_16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter facto");
	int facto =sc.nextInt();
	int a = facto;
	int fact=1;
	do {
		fact = fact*a;
		
		a--;
	}while(a>=1);	
	System.out.println(fact);
}
}
