package stream_API_Basic_7;

import java.util.List;
import java.util.Arrays;

public class Qb10 {

	public static void main(String[] args) {	
//	From numbers(provided at top of doc),count how many numbers are greater than 4		
	List<Integer> numbers = Arrays.asList(-1,0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 long list = numbers.stream().filter(a -> a>4).count();
	  System.out.println(list);
	}
}
