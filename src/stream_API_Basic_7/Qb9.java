package stream_API_Basic_7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Qb9 {

	public static void main(String[]args){
	
// From numbers(provided at top of doc),find the minimum[lowest] number.
		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,0,-1,6, 7, 8, 9, 10);
		
	  Optional<Integer> c  = numbers.stream().map(b -> b).min(Integer::compareTo);
		System.out.println(c.get());
	}
	
	
	
}
