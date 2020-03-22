/***Pendulum question**/
package test;
import java.util.*;
import java.math.*;
import java.io.*;

public class ArrayQues {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			
        	int n = Integer.parseInt(br.readLine());
        
        	ArrayList<Integer>res = new ArrayList<Integer>();
        	int arr[] = new int[n];
        	
        	String elems[] = br.readLine().split(" ");
        	
        	for(int j = 0;j<elems.length;j++)
        		res.add(Integer.parseInt(elems[j]));	
       
        	Collections.sort(res);
        	
        	int mid = res.size()%2 == 0?(res.size()-1)/2:res.size()/2;
        	
            arr[mid]= res.get(0);
        	
        	int a = mid;
        	int k = 0;
        	int j = 1;
           
        	for(int i = 1;i<=mid;i++) {
        	
        		if(mid+i<arr.length) {
        		arr[mid+i]=res.get(j);
        		j++;
        		}
        		if(mid-1 >= 0) {
        		arr[mid-i]=res.get(j);
        		j++;
        		}
        		
        	}
        	if(res.size()%2 == 0)
        		arr[res.size()-1]=res.get(res.size()-1);
         	
        	for(int d = 0;d<arr.length;d++) 
        		System.out.print(arr[d]+" ");
        	
        }
	}

}

