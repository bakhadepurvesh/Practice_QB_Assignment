package Array_in_Java_6;

public class QB_4 {
public static void main(String[] args) {
		
		int[]arr = {21,23,12,56,14,45};
		
		int min = arr[0];
		 for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
			if(arr[i]<min){     
				 min =arr[i];   
			}
		}
		 System.out.println("minimum val:"+min);
	}
}

