package while_loop_4_1;

public class QB_18 {
	public static void main(String[]args){
		int value= 101;
		int stroed = value;
		int reverse =0;
		int i =0;
		while(i<value){
		int number = value%10; // get last value 
		 reverse = reverse*10+number;
		 value/=10;
		}
		System.out.println(reverse);
		if(reverse==stroed){  
		 System.out.println("value is right");
		}
		else{
		System.out.println("Wrong");
		}
		}
}
