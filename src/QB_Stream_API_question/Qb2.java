package QB_Stream_API_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Qb2 {
	
	public static void main(String[] args) {
	
//  From list of integers extract even number and return them in list
		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	 List<Integer>list = numbers.stream().filter(num->num%2==0).collect(Collectors.toList());	
	 System.out.println(list);
	}
	
}
