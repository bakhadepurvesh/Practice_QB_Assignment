package list_and_set_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qb9 {
	
	public static void main(String[] args) {
		
//		 Create a List<String> with some duplicate entries. Print all unique elements
//		 (without using Set)
		List<String> names = Arrays.asList("jiya","raj","jiya");
		
		//names.remove(0); It wont work with asList method because it internally using array which is
		//of fixed size we can not add or remove the element in array once it is created 
		//thats why it wont work and throws exception of abstract list.
		
		List<String> uniqueNames = new ArrayList<String>();
		
		for(String n :names) {
			if(!uniqueNames.contains(n)) {
				uniqueNames.add(n);
			}
		}
		for(String un :uniqueNames) {
			System.out.println(un);
		}

	}
	}