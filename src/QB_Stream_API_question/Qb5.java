package QB_Stream_API_question;

import java.util.Arrays;
import java.util.List;


public class Qb5 {

	public static void main(String[] args) {
//		Use listInteger(provided at top of doc), square every element in list and sum all of them, print
//		sum over console.
		
		List<Integer> list = Arrays.asList(2,4,6,8,10);
		
		int a =list.stream().mapToInt(b -> b*b).sum();
		//System.out.println(a);
		
	}
	
// mapToInt  is method in java Stream Api. 
//	mapToInt is used to convert a Stream<T> into an IntStream.
//	IntStream is for primitive int values, not Integer objects.
//	This allows you to use numeric operations like sum(), average(), max(), min().
//	mapToInt takes a function that converts each element into an int.
//	Example: You can use it to get the square of each element or the original value from a List<Integer>.
}
