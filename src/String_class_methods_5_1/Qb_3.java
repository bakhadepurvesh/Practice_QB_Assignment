package String_class_methods_5_1;

public class Qb_3 {
	public static void main(String[]args){

		//literals save
		String n="lion";
		String n1="Lion"; 
		System.out.println(n==n1);//false
		System.out.println(n.equals(n1));//false

		//heap memory save
		String s= new String("Lion");
		String s2= new String("Tiger");
		System.out.println(n1.equals(s));//true
		System.out.println(n.equals(s2));//false
		}
}
