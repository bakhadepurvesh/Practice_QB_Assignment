package string_Using_For_Loop_5_2;

public class QB_4 {
public static void main(String[] args) {
 String name ="I am Java Devloper";	
 int count =0;
 for(int i=0;i<name.length();i++){
	 //System.out.println(i); 
	 if(name.charAt(i)==' '){
              count++;
	 }
 }
 System.out.println("Space is :"+count);
}
}
