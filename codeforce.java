package test;
import java.util.*;
 class codeforce{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
	int t;
	t = s.nextInt();
	while(t-- > 0) {
		int n = s.nextInt();
		int total = 0;
		int arr[] = new int[n];
	
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			total+=arr[i];
		}

		while((total/n)*n < total) {
			total+=1;
		};
		System.out.println(total/n);
		total = 0;
	}

	}
};


