package test;
import java.util.*;

public class Circle {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

		int m = s.nextInt();
			int arr[] = new int[m - 1];
		int ans[] = new int[m];
			for (int i = 0; i < m - 1; i++) {
				arr[i] = s.nextInt();
			ans[arr[i] - 1]++;
			}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			}

		}
}


