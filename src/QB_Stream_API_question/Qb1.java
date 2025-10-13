package QB_Stream_API_question;

import java.util.Arrays;
import java.util.List;

public class Qb1 {
	
public static void main(String[] args) {
	
//	1. From list of integers extract even number and print them on console.
	
	List<Integer> even = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

	even.stream().filter(b -> b%2==0).forEach(a -> System.out.println(a)); 
}
}
