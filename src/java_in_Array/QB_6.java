package java_in_Array;

public class QB_6 {
 public static void main(String[] args) {
	
		int[]num = {48,52,61,59,80};
		int total=0;
        int count=0;
		for(int i=0;i<num.length;i++){
			total=total+num[i];
		}
		 count=num.length;
		 int avg =total/count;
		 System.out.println(avg);
		 
	}
}
