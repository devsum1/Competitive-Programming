import java.io.*;
import java.util.*;

public class cf650 {

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

	public static void printArr(long arr[], String s) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + s);
	}

	  public static long[] randomArr(int n) {
	      Random rd = new Random(); // creating Random object
	      long[] arr = new long[n];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); // storing random integers in an array
	         System.out.println(arr[i]); // printing each array element
	      }
	      return arr;
	   }
	public static void main(String[] args) throws IOException {

		int T = 1;

		while (T-- > 0) {
			int n = nextInt();
			long arr[] = new long[n];
			String input[] = next().split(" ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Long.parseLong(input[i]);
			}

			long max = 0;


			for (int i = 0; i < arr.length; i++) {
				long res = max + arr[i];
				max = Math.max(max, res);
				arr[i] = res;

			}
			printArr(arr, " ");


		}
	}

}
