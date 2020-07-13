import java.io.*;
import java.util.*;

public class CountTriplets {

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

			int input[] = nextArr();
			int n = input[0];
			int r = input[1];
			int test[] = new int[n];
			StringBuilder str = new StringBuilder("");
//			for (int i = 0; i < n; i++) {
//				test[i] = 1;
//			}
			int arr[] = nextArr();
			
			HashMap<Integer, ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();

			for (int i = 0; i < arr.length; i++) {
				if (!hash.containsKey(arr[i])) {
					hash.put(arr[i], new ArrayList<Integer>());
				}

				hash.get(arr[i]).add(i);

			}
			System.out.println(hash);

			long ans = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % r != 0)
					continue;
				int a = arr[i] / r;
				int b = arr[i] * r;
				int pre = 0;
				int post = 0;

				if (hash.containsKey(a) && hash.containsKey(b)) {
					for (int k = hash.get(a).size() - 1; k >= 0; k--) {
						if (hash.get(a).get(k) < i) {
							pre += k + 1;
							break;
						}
					}
					for (int l = 0; l < hash.get(b).size(); l++) {
						if (hash.get(b).get(l) > i) {
							post += hash.get(b).size() - l;
							break;
						}
					}

					ans += (long) pre * post;
					BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
					out.write(ans);
					out.close();
				}

			}

			System.out.println(ans);
		}
	}

}
