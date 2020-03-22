package test;
import java.util.*;

public class Spiral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int [][]arr = new int[m][n];
		
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				arr[i][j] = s.nextInt();
			}
		}

			for(int i = 0;i<m;i++) {
		for(int j = 0;j<n;j++) {
			System.out.print(arr[i][j]);
		}
System.out.println();
	}

		int a = 0,b = n-1,c = m-1,d = 0,q = 0,g= 0;
		 z:while(q<(m*n)){
			for(int i = a;i<n-g;i++) {
				q++;
				if(q > m*n)
					break z;
				System.out.println(arr[a][i]);				
			}
			a++;
			
			for(int j = a;j<m-g;j++) {
				q++;
				if(q > m*n)
					break z;
				System.out.println(arr[j][b]);
			}
			b--;
			
			for(int k = (n-2)-g;k>=g;k--) {
				q++;
				if(q > m*n)
					break z;
				System.out.println(arr[c][k]);
				
			}
			c--;
			
			for(int l = (m-2)-g;l>g;l--) {
				q++;
				if(q >m*n)
					break z; 
				System.out.println(arr[l][g]);

			}
			g++;
			 
					}
		   
  
	}

}
