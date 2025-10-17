package Array_in_Java_6;

public class QB_7 {
public static void main(String[] args) {
	int[]count = {2,10,21,32,43,54};
	int evenCount=0;
	int oddCount=0;
	int	zero=0;
	for(int i=0; i<count.length;i++){
		if(count[i]%2==0){
			evenCount++;
		}
		else if(count[i]%2==1){
		   oddCount++;
		}
//		else if(count[i]%2!=0){
//			zero++;
//		}
	}
	System.out.println("Even number:"+evenCount);
	System.out.println("Odd number:"+oddCount);
//	System.out.println("Zero's "+zero);
}
}
