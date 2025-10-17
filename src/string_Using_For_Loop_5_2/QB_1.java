package string_Using_For_Loop_5_2;

public class QB_1 {
public static void main(String[] args) {
	String name ="Suyash";
	int count =0;
	for(int i=0;i<name.length();i++){
		
		if(name.charAt(i)=='a'||name.charAt(i)=='e'
				||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||
				name.charAt(i)=='A'||name.charAt(i)=='E'
				||name.charAt(i)=='O'||name.charAt(i)=='I'||name.charAt(i)=='U')
		{
//			System.out.println("Count is:"+count);
			 count++;
		}
//		 count++;
	}
	System.out.println("Count is:"+count);
}
}
