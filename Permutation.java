import java.io.*;
import java.util.*;


public class Permutation {

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

	public static String swap(StringBuilder s, int a, int b) {

		char temp = s.charAt(a);
		s.setCharAt(a, s.charAt(b));
		s.setCharAt(b, temp);

		return s.toString();
	}

	public static int[] matchingStrings(String[] strings, String[] queries) {

		int ans[] = new int[queries.length];
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			if (!hash.containsKey(strings[i]))
				hash.put(strings[i], 1);
			else
				hash.put(strings[i], hash.get(strings[i] + 1));
		}

		for (int i = 0; i < queries.length; i++) {
			if (hash.containsKey(queries[i]))
				ans[i] = hash.get(queries[i]);
			else
				ans[i] = 0;

		}
		return ans;

	}

	public static void permute(String n, int s, int f) {

		// basis of bactracking
		// Stuck
		if (f == n.length() ) {
			s += 1;
			f = s + 1;
		}
		System.out.println(s + " " + f);
		if (s == n.length() || f == n.length())
			return;


		n = swap(new StringBuilder(n), s, f);
		System.out.println(n);

		permute(n, s, f + 1);

	}

	static int ans = 0;

	public static int countSame(int arr[], int s, int e, int x) {
		// Binary search
		// Count occurence of same elements in sorted arr

		if (s > e)
			return -1;

		int mid = (s + e) / 2;

		if (arr[mid] == x) {

			if (mid != 0 && arr[mid - 1] == arr[mid])
				countSame(arr, s, mid - 1, x);
			else
				ans -= mid;

			// For last occurence of character in sorted array
			if (mid != arr.length - 1 && arr[mid + 1] == arr[mid])
				countSame(arr, mid + 1, e, x);
			else
				ans += mid;

		} else if (arr[mid] > x)
			countSame(arr, s, mid - 1, x);
		else
			countSame(arr, mid + 1, e, x);

		return ans + 1;

	}

	public static int frepeated(int arr[], int s, int e, int x) {
		// Return the first ocurrence of element in sorted arr.
		if (s > e)
			return -1;

		int mid = (s + e) / 2;

		if (arr[mid] == x) {

			if (arr[mid - 1] == arr[mid] && mid != 0)
				frepeated(arr, s, mid - 1, x);
			else
				return mid + 1;
			
		} else if (arr[mid] > x)
			frepeated(arr, s, mid - 1, x);
		else
			frepeated(arr, mid + 1, e, x);

		return -1;

	}

	public static int regionMatrix(int sum, int m, int n, int mat[][], int row, int col) {
		ans = Math.max(ans, sum);
		if (m == row || n == col)
			return ans;
		if (mat[m][n] == 0)
			sum = 0;

		regionMatrix(sum + mat[m][n], m + 1, n, mat, row, col);
		regionMatrix(sum + mat[m][n], m, n + 1, mat, row, col);
		return ans;
	}
	public static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov) {
		Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println(s);
		vis[s] = true;
		queue.add(s);

		while (!queue.isEmpty()) {
			int elem = queue.poll();

			for (int i : list.get(elem)) {
				if (!vis[i]) {
					System.out.println(i);
					vis[i] = true;
					queue.add(i);
				}
			}

		}
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				arr[i][j] = s.nextInt();
		}

		int res = regionMatrix(0, 0, 0, arr, row, col);
		System.out.println(res);
		}
	}

}
