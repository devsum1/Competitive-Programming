import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class hwi2 {

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

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {
			int n = nextInt();
			long aspeed = 0;
			long bspeed = 0;
			long ans = 0;
			
			int arr[] = nextArr();
			int brr[] = nextArr();

			for (int i = 0; i < arr.length; i++) {
				aspeed += arr[i];
				bspeed += brr[i];
				if (aspeed == bspeed && arr[i] == brr[i])
					ans += arr[i];
			
			}
			System.out.println(ans);

		}
	}

}
