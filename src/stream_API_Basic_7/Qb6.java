package stream_API_Basic_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Qb6 {
	
	public static void main(String[] args) {
// Create a integer list with duplicate and remove those with for loop and stream api.
	
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4,4,5, 5, 6, 7, 8, 9, 10);
		
		
		  List<Integer>list=numbers.stream().distinct().collect(Collectors.toList());
		  System.out.println(list);
		
		  // distinct method is used to find the duplicate element in the list.
	}
}
