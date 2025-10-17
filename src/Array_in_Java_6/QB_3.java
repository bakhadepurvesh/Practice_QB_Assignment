package Array_in_Java_6;

public class QB_3 {
public static void main(String[] args) {
	
	int[]num = {11,12,43,14,15};
	
	int max =num[0];
	
	for(int i=0;i<num.length;i++){
		//System.out.println(num[i]);
		if(max<num[i]) {
	      max = num[i];
		} 
	}
	System.out.println(max);
	
}
}
