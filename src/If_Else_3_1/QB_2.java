package If_Else_3_1;

public class QB_2 {

	public static void main(String[]args){
		char c ='a';
		char b ='A';
	    int a = 23;
		
		if(Character.isLowerCase(c)){
			System.out.println("The char is lower case");
		}
		else {
			System.out.println("The char is  not Upper case");
		}
		if(Character.isUpperCase(b)){
			System.out.println("The char is Upper case");
		}
		else {
			System.out.println("The char is  not lower case");
		}
		
		if(Character.isDigit(a)) // error in console 
		{
			System.out.println("The number is digit ");
		}else {
			System.out.println("The number is  not digit ");
		}
	
	}
	
}
