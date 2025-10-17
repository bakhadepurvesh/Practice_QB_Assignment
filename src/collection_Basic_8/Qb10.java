package collection_Basic_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Qb10 {
  public static void main(String[] args) {
  // Create a List<String> of names and print the name with the longest length  
	
	  List<String> names = Arrays.asList("Ram","Vishal","Laurencewatkin","Mohit"); 
	   
	  String na =Collections.max(names, Comparator.comparing(String::length));
	  
	   System.out.println(na);
	  
	  }
}

