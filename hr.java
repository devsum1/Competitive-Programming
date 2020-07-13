import java.io.*;
import java.util.*;

public class hr {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static int[] sortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
	}

	public static int[] desortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a, Collections.reverseOrder());

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
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

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			StringBuilder ans = new StringBuilder();
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			String arr[] = new String[n];
			for (int i = 0; i < n; i++) {
				arr[i] = next();
			}
			int m = nextInt();
			int val[] = new int[m];

			for (int i = 0; i < arr.length; i++)
				val[i] = nextInt();

			for (int i = 0; i < arr.length; i++) {
				int count = 0;
				int count1 = 0;
				for (int j = 0; j < arr[i].length(); j++) {
					if (arr[i].charAt(j) == '>')
						arr1.add(j);
					else
						arr2.add(j);

				}

				Collections.sort(arr1);
				Collections.sort(arr2);
				System.out.println(arr1);
				System.out.println(arr2);
				if (count < count1)
					ans.append(0);
				else if (count - count1 <= val[i])
					ans.append(1);
				else
					ans.append(0);
				ans.append("\n");
			}

			System.out.println(ans);

		}
	}

}
