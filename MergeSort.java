package test;
import java.util.*;


public class MergeSort {
	
static void merger(int arr[],int l,int m,int r) {

	int temp1[] = new int[m-l+1];
	int temp2[] = new int[r-m];
	int a =0 ,b = 0,k = l;
	
	for(int i = 0;i<temp1.length;i++) {
		temp1[i] = arr[l+i];
	}
		
		
	for(int j = 0;j<temp2.length;j++) {
		temp2[j] = arr[m+j+1];
	}
		

	while(a<temp1.length && b < temp2.length) {
		if(temp1[a] < temp2[b]) {
			arr[k] = temp1[a++];
			
		}
		else{
			arr[k] = temp2[b++];
		}

		k++;
	}
	
	for(;a<temp1.length;a++) {
		arr[k]= temp1[a++];
	}
	for(;b<temp2.length;b++) {
		arr[k]= temp2[b++];
	}
	
 	
}
static void divide(int arr[],int l,int r) {
	if(l < r) {
		int m = (l+r)/2;
		divide(arr,l,m);
		divide(arr,m+1,r);
		merger(arr,l,m,r);
	}
	
}

public static void main(String args[]) {
	int arr[] = {38, 27, 43, 3, 9, 82, 10};
	divide(arr,0,arr.length-1);
	for(int i = 0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
