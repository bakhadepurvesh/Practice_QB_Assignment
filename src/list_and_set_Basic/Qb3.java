package list_and_set_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qb3 {

//	 Create a List<Integer> and print the sum of all even numbers.
	public static void main(String[] args) {

		int tSum = 0;
		List<Integer> la = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for (int sum : la) {
			if (sum % 2 == 0) {
				tSum = tSum + sum;
				System.out.println(tSum);
			}
		}

	//	System.out.println("The Sum all  Even Number: " + tSum);

	}

//public static void main(String[] args) {
//
//	List<String>la = Arrays.asList("A","B","C","D");
//
//	 for( String a : la){
//		 if(la.contains("E")){
	////			 System.out.println("Yes");
//		 }
//		 else {
	////			 System.out.println("No");
//		 }
//	 }
//	 System.out.println("Yes");
//	 System.out.println("No");
//}

}
