package list_and_set_Basic;

import java.util.Arrays;
import java.util.List;

public class Qb8 {

	public static void main(String[] args) {
//Create a List<Integer> and count how many elements are divisible by 3 and 5 both.
		
		List<Integer> la = Arrays.asList(1,2,4,6,7,8,11,12,13,14,15);
		
//		 int countFive =0;
//		 int countThree =0;
//		 for(int a : la){
//			 if(a%3==0){
//				 countThree++;
//			 }
//			 if(a%5==0){
//				countFive++; 
//			 }
//		 }
//		 System.out.println("Count Three is : "+countThree);
//		 System.out.println("Count Five is : "+countFive);
		
		// Using stream api or Lambda expression 
		
		long countFive =la.stream().filter(a -> a%5==0).count();
		   System.out.println(countFive);
		
		long countThree=la.stream().filter(b -> b%3==0).count();
		   System.out.println(countThree); 
		   
	}
	
}
