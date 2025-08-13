package do_While_loop;

public class QB_7 {
public static void main(String[]args){
	
	int num =1;
	do {
		if(num%3==0){
			System.out.println(num);
			num++;
		}
		else {
			num++;
			continue;
		}
//		System.out.println(num);
//		num+=3;
	} while(num<=30);
//	for(int v=1;v<=30;v++) {
//		if(v%3==0){
//			System.out.println(v);
//		}
//}
	}
	
	
}

