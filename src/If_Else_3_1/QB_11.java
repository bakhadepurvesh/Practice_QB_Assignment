package If_Else_3_1;

import java.util.Scanner;

public class QB_11 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject_1 marks :");
		int subj = sc.nextInt();
		System.out.println("Enter the subject_2 marks :");
		int subj1 = sc.nextInt();
		System.out.println("Enter the subject_3 marks :");
		int subj2 = sc.nextInt();
		
		if(subj<33 && subj1<33 && subj2<33){
			 System.out.println("fail");
		}else {
			System.out.println("pass");
		}
		
	}
	
}
