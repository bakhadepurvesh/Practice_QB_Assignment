package do_While_loop_4_2;

public class QB_17 {
public static void main(String[] args) {
	int digit =4561;
	int rev=0;
    
  do {
//	  digit/=10;
	  int b = digit%10;
	  digit/=10;
	  rev=rev*10+b;
	  
	  }while(digit!=0);
  System.out.println(rev);
  }

}
