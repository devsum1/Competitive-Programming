import java.io.*;
import java.util.*;

public class CastleOnGrid {

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

	static int ans = Integer.MAX_VALUE;

	public static int castlemove(String grid[][], int s, int e, int size) {

		if (s >= size && (e == 0 || e >= size))
			return 1;

		if (s == 0 && e >= size)
			return 1;

		System.out.println(s + " " + e);

		if (grid[s][e].equals("ans"))
			return 1;

		if (grid[s][e].equals("X"))
			return 0;

		return Math.min(castlemove(grid, s, e + 1, size) + castlemove(grid, s + 1, e, size), ans);
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			String grid[][] = new String[n][n];

			for (int i = 0; i < n; i++) {
				String arr[] = next().split("");
				for (int j = 0; j < arr.length; j++)
					grid[i][j] = arr[j];

			}

			int input[] = nextArr();
			grid[input[2]][input[3]] = "ans";
			int ans = castlemove(grid, 0, 0, n);
			System.out.println(ans);
		}
	}

}
