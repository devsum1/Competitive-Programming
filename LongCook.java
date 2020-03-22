package test;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.FieldPosition;



class LongCook{
	public static boolean isLeap(int i) {
		if  ((((i % 4 == 0) && i % 100 != 0)) ||  (i % 400 == 0)) 
            return true;
		 return false;  
		
	}
	static int arr[] = {
			3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,5,6,7,2,3
			,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,
			5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6
			,7,1,2,4,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,
			2,3,4,6,7,1,2,3,4,5,6,1,2,3,4,6,7,1,2,4,5,6,7,2,3,4,
			5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,5,6,7,2,3
			,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,5,6,7,
			2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,5,6,7,1,2,
			3,4,6,7,1,2,4,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,
			7,1,2,4,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,
			2,4,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,5,
			6,7,2,3,4,5,6,7,1,2,4,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4
			,6,7,1,2,4,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4
			,5,6,7,2,3,4,5,7,1,2,3,5,6,7,1,3,4,5,6,1,2,3,4,6,7,1,2,4,5,6,7,2,3,4,5,7,1,2,
	};
	
     public static void main(String[] args) throws java.lang.Exception{
	   Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		while(T-- > 0) {
			int ans = 0;
			int m1 = s.nextInt();
			int y1 = s.nextInt();
			int m2 = s.nextInt();
			int y2 = s.nextInt();
			
			y1 = m1<=2?y1:y1+1;
			y2 = m2>=2?y2:y2-1;
	
		for(int i = y1;i<=y2;i++) {
			    if(arr[i%400] == 7||(arr[i%400] == 1 && !isLeap(i))) {
			    	ans+=1;   
			    }
		}
		 System.out.println(ans);
		
		}

}
}


