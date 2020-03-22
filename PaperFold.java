package test;
import java.util.*;

public class PaperFold {
public static void main(String args[]){
  	Scanner  s = new Scanner(System.in);
  	int arr[] = {1,2,3,4,5};
  	int k = 5;
  	int m = 3;
  	int g = 1;
  	 int sum = arr[0];
  	for(int i = 1;i<arr.length;i++) {
  		System.out.println(sum+" "+i);
  		if(sum<k) {
  			sum+=arr[i];
  		}else {
  			System.out.println(i);
  			g=g+1;
  			sum = arr[i];
  		}
  		
  	}
  	System.out.println(g);
  	if(g>m) 
  		System.out.println("NO");  	
  	else
  		System.out.println("YES");
	
}
}
