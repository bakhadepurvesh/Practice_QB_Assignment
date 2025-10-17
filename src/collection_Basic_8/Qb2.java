package collection_Basic_8;

import java.util.ArrayList;
import java.util.List;

public class Qb2 {
//Create a List<String> with names and print only those names which start with the
//letter 'A'.
	
	public static void main(String[] args) {
		
	List<String>la = new ArrayList<String>(); 
	la.add("Apple");
	la.add("Array");
	la.add("Amaravati");
	la.add("Puna");
	
	 for(String name :la){
		 if(name.startsWith("A")){
			 System.out.println(name);
		 }
	 }
	
	}
	
}
