package If_Else_3_1;

import java.util.Scanner;

public class QB_13 {
	
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character:");
	char letter =sc.next().charAt(0);
	if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'&& letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
	{
		System.out.println("vowel");
	}
	else {
		System.out.println("consonant");
	}
	
}
}
