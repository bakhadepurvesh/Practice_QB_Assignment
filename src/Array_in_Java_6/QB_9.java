package Array_in_Java_6;

public class QB_9 {
public static void main(String[] args) {
	int[]elements = {12,25,37,42,55};
	int target=42;
	int Answer;
	for(int i=0;i<elements.length;i++){
		if(elements[i]==target){
		 System.out.println("true");
		}
	}
	System.out.println("Number is:"+target);
}
}
