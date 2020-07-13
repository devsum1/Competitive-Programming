import java.io.*;
import java.util.*;

public class AprilFool {

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
			int val[] = nextArr();
			int type[] = nextArr();

			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i : val)
				result.add(i);
			Collections.sort(result);

			Boolean isSorted = true;
			for (int i = 0; i < result.size(); i++) {

				if (val[i] != result.get(i)) {
					isSorted = false;
					break;
				}
			}

			if (isSorted)
				System.out.println("Yes");
			else {
				int zero = 0;
				int one = 0;
				for (int i = 0; i < type.length; i++) {
					if (type[i] == 0)
						zero++;
					else
						one++;
				}

				System.out.println(one > 0 && zero > 0 ? "Yes" : "No");
			}

		}
	}

}
