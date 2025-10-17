package while_loop_4_2;

public class QB_19 {
public static void main(String[] args) {
	int a=432;
	int product=1;
	
	while(a>0){
		int b = a%10;  // get last digit
		product = product*b;  // logic of product is     right to left value move 2*3=6 ; 6*4=24
		a/=10;					// remove last digit
	}
	System.out.println("The Product value is:"+product);
}
}
