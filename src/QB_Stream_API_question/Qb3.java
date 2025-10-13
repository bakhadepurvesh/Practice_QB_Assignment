package QB_Stream_API_question;

import java.util.Arrays;
import java.util.List;

public class Qb3 {

	public static void main(String[] args) {
//		count odd integers from list of integer.	
		
		List<Integer> la = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		la.stream().filter(b -> b%2==1).forEach(a -> System.out.println(a));
		
	}
	
}
