package practice_QB_Assignment_Whileloop;

import java.util.Scanner;

public class QB_13 {
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the n:");
int a =0;
//int n =100;
int n =sc.nextInt();
int add =0;
while(a<=n){
	if(a%2==1){
		add =add+a;
//		System.out.println(add);
		}
	a++;
}
System.out.println(add);


}
}
