package for_Loop_4;

import java.util.Scanner;

public class QB_18 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int cube = sc.nextInt();
    int num = 1;
 for (int a=1;a<=3;a++) {
	 num =cube*num;
	 System.out.println(num);
 }
}
}
