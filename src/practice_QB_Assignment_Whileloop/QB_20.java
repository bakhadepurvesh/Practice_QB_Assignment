package practice_QB_Assignment_Whileloop;

public class QB_20 {
public static void main(String[] args) {
	
	int num = 589432;
	int great =0;
	
	while(num>0){
		int a = num%10;    // last digit 
		if(a>great){		// a is greater of great
			great = a;		// a value stored is great
		}
		num/=10;				// remove the value 
	}
	System.out.println("graetest number:"+great);	// print  the greatest number
	
}
}
