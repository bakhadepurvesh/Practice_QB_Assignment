package list_and_set_Basic;

import java.util.Arrays;
import java.util.List;
public class Qb7 {

	public static void main(String[] args) {
		
//		Create a List<String> of names and print all names in uppercase using enhanced
//		for-loop.
		
		List<String> list =  Arrays.asList("Suyash", "Purvesh","Developer","Programmer");		
//		
//		for(String printUpp : list){
//			System.out.println(printUpp.toUpperCase());
//		}		
		// Using Stream api
		list.stream().map(li -> li.toUpperCase()).forEach(a -> System.out.println(a));	
	}
}
