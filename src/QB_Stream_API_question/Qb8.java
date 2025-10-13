package QB_Stream_API_question;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Qb8 {

	public static void main(String[]args) {
		
//   From numbers(provided at top of doc),find the maximum[highest] number	
		
		List<Integer> la =  Arrays.asList(110,2,3,4,50,6,70,8,9,10);
	    	Optional<Integer> num=la.stream().map(a -> a ).max(Integer::compareTo);
		    System.out.println(num.get());
		
		    // max is the used to find out the Maximum number or max is terminal op
		    // map is Intermidate op
		    // Optional is final class or Optional<T> is a generic class —
            // it can hold an object of any type (like Integer, String, etc.)
		    ///You cannot create an Optional object using new.
//		    Optional<Integer> num = Optional.of(10);
//		    Optional<String> name = Optional.of("Purvesh");

	}
	
}
