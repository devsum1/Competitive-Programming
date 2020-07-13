import java.io.*;
import java.util.*;

public class Misspoint {

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
			HashMap<Integer, Integer> rowhash = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> colhash = new HashMap<Integer, Integer>();
			for (int i = 0; i < 4 * n - 1; i++) {
				int arr[] = nextArr();
				int row = arr[0];
				int col = arr[1];

				if (colhash.containsKey(col))
					colhash.put(col, colhash.get(col) + 1);
				else
					colhash.put(col, 1);

				if (rowhash.containsKey(row))
					rowhash.put(row, rowhash.get(row) + 1);
				else
					rowhash.put(row, 1);

			}
			int missrow = -1;
			int misscol = -1;
			for (int i : rowhash.keySet()) {
				if (rowhash.get(i) % 2 != 0) {
					missrow = i;
					break;
				}

			}

			for (int i : colhash.keySet()) {
				if (colhash.get(i) % 2 != 0) {
					misscol = i;
					break;
				}

			}
			System.out.println(missrow + " " + misscol);

		}
	}

}
