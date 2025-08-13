package do_While_loop;

import java.util.Scanner;

public class QB_13 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N:");
	int n = sc.nextInt();
	int oddNum=0;
	for(int a=1;a<=n;a++){
    
      if(a%2==1){
    	oddNum =oddNum+a;    
//    	System.out.println(a); 
      }			
	}
	System.out.println(oddNum); 	
	}
}

