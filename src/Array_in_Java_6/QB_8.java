package Array_in_Java_6;

public class QB_8 {
public static void main(String[]args){
	int[]number={10,-5,20,-15,0,25};
	int posNum=0;
	int negNum=0;
	
	for(int i=0;i<number.length;i++){
		if(number[i]>0){
			posNum++;
		}
		if(number[i]<0){
			negNum++;
		}
	}
	System.out.println("Positive number:"+posNum);
	System.out.println("Negative number:"+negNum);
}
}
