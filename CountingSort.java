package test;

import java.util.Arrays;
import java.util.Collections;

public class CountingSort {

	public static void main(String[] args) {
		
		 int arr[] = {-5,-3,0,1,-3,-1,5};
		 int max = Arrays.stream(arr).max().getAsInt();
		 int min = Arrays.stream(arr).min().getAsInt();
	
		 int range = (max-min)+1;
		 int count[] = new int[range];
		 int output[]= new int[arr.length];
		 
		 for(int i = 0;i<arr.length;i++) {
			 count[arr[i]-min]++;
		 }
		 for(int i = 1;i<count.length;i++) {
			 count[i]+=count[i-1];
		 }
		 for(int i = 0;i<arr.length;i++) {
			output[count[arr[i]-min]-1]=arr[i];
			count[arr[i]-min]--;
		 }
		 
		 for(int i = 0;i<output.length;i++) {
			 System.out.print(output[i]+" ");
		 }

	}

}
