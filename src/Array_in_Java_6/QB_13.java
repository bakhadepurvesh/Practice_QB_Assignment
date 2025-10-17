package Array_in_Java_6;

public class QB_13 {
public static void main(String[] args) {
	int[]a= {10,20,30};
	int[]b= {40,50};
	int[]c=new int[6];
	
	for(int i=0;i<a.length;i++){
	         c[i]=a[i];    
	}
    for(int i=0;i<b.length;i++){
	    c[a.length+i]=b[i];	
    }
    for(int i=0;i<c.length;i++){
    	System.out.println("Our Array:"+c[i]);
    }
   
}

}
