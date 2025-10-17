package while_loop_4_2;

import java.util.Scanner;

public class QB_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	for(num=1;num<=50;num++) {
	while(num%2==0){
			System.out.println("even :"+num);
			num++;
		}
	}
	}
}

