package StringFor;

import java.util.Scanner;

public class QB_6 {
	  
	    public static void main(String[] args) {
	    	String rev =" ";
	    	//Scanner sc = new Scanner(System.in);
	        String line ="Hello Java";
	        for(int i =line.length()-1;i>=0;i--){
	        	rev = rev + line.charAt(i);		
	        }
	        System.out.println(rev);
	}  
}


