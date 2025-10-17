package for_Loop_4;

import java.util.Scanner;

public class QB_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int number = sc.nextInt();
	for(int a=1;a<=10;a++){
		int square = a* number;
	 System.out.println(a+"x"+number+"="+square);	
	}
	
	
}
}
