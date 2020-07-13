import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class SubstringSum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	static BigInteger dp[][];

	public static BigInteger subsum(String n, BigInteger ans) {

		for (int i = 0; i < n.length(); i++) {
			for (int j = i; j < n.length(); j++) {
				int ival = Character.getNumericValue(n.charAt(i));
				int jval = Character.getNumericValue(n.charAt(j));

				if (j - i > 0)
					dp[i][j] = dp[i][j - 1].multiply(BigInteger.TEN).add(new BigInteger(jval + ""))
							.remainder(new BigInteger(1000000007 + ""));
				else
					dp[i][j] = new BigInteger(jval + "").remainder(new BigInteger(1000000007 + ""));

				ans = ans.add(new BigInteger(dp[i][j] + ""));
				System.out.println(ans);
			}
		}
		return ans;

	}

	public static int vansh(int arr[], int n, int k) {

		Arrays.sort(arr);
		int ans = 0;
		int present = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 <= k) {
				ans += arr[i];
				present = arr[i];
			} else
				ans += present;
		}
		System.out.println(ans);
		return ans;
	}
	public static void main(String[] args) throws IOException {
		int T = nextInt();
		while (T-- > 0) {
			int n = nextInt();
			int arr[] = nextArr();
			int k = nextInt();
			System.out.println(vansh(arr, n, k));
		    
		}
	}

}
