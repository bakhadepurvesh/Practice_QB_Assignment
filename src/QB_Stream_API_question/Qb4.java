package QB_Stream_API_question;

import java.util.Arrays;
import java.util.List;

public class Qb4 {

	public static void main(String[] args) {
		
//		Use listInteger(provided at top of doc) list to generate output as list
//		output →4,16,36,64,100.
		
		List<Integer> list = Arrays.asList(2,4,6,8,10);
		
		list.stream().map(a -> a*a).forEach(b -> System.out.println(b));
		
		
		
		
	}
}
