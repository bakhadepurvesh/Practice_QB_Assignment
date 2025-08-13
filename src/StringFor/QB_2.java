package StringFor;

public class QB_2 {
public static void main(String[] args) {
	
 String sent = "solution";
 int count =0;
//  String letter =Sent.toLowerCase();
 
 for(int i=0;i<sent.length();i++){
	 
	 if(sent.charAt(i)=='a'||sent.charAt(i)=='e'||
			 sent.charAt(i)=='i'||sent.charAt(i)=='o'||sent.charAt(i)=='u'
	   ){
		 continue; 
	   } 
	 count++;
 }
 System.out.println(count);
	
}
}
