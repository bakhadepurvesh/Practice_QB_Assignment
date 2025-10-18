package stream_API_Basic_7;

import java.util.Arrays;
import java.util.List;

public class Qb12 {

	public static void main(String[] args) {
		
//  From numbers(provided at top of doc),get the first 5 elements from the list.
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// convert the Stream 
		 List<Integer> a =l.stream().limit(5).toList();
		 
		 System.out.println(a);
		
	}
	
}
