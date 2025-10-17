package string_Using_For_Loop_5_2;

public class QB_5 {
	public static void main(String[]args){

		String text="I am Full Stack Devloper";
		 int counter_upper=0;
		 int counter_lower=0;
		  for( int i=0;i<text.length();i++){
		 //System.out.println(i);
		 if(Character.isUpperCase(text.charAt(i))){
		   counter_upper++;
		 
		} 
		else if(Character.isLowerCase(text.charAt(i))){
		    counter_lower++;
		}
		}
		 System.out.println("Upper Case is:"+counter_upper);
		 System.out.println("Lower Case is:"+counter_lower);
		}

}
