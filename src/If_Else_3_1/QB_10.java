package If_Else_3_1;

import java.util.Scanner;

public class QB_10 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your unit");
		int unit = sc.nextInt();
		int cost ;
		
		if(unit<=100){
			 cost = unit * 5;
		    }
		    else{ 
		    	if(unit<=300){
				 cost = unit * 7; 
		    	}
		    	else{
					cost = unit*10;
				}
			}
		
	  System.out.println("Your electric bill is:"+cost);
	}
}
