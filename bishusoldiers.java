import java.io.*;
import java.util.*;

public class bishusoldiers {

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

	public static void twoRepeated(int arr[]) {
		int aux[] = new int[arr.length + 2];

		for (int i = 0; i < arr.length; i++) {
			if (aux[arr[i]] == 0)
				aux[arr[i]]++;
			else
				System.out.print(arr[i] + " ");
		}
	}

	public static int missingNumber(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] <= arr.length) {
				int s =arr[i]-1;
				if(s>0)
					arr[s - 1] = -1;
				arr[arr[i] - 1] = -1;
				
				
			}
		}
		int startFrom = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1)
				++startFrom;
			else
				return startFrom;
		}
		return arr.length + 1;

	}
	public static int maxWater(int arr[]) {
		if (arr.length == 1)
			return 0;
		int low = 0;
		int high = arr.length - 1;
		int ans = 0;
		while (low < high) {
			ans = Math.max(ans, Math.min(arr[low], arr[high]) * (high - low - 1));
			if (arr[low] < arr[high])
				low++;
			else
				high--;
		}
		return ans;
	}
	public static int roofTop(int arr[]) {
		int ans = Integer.MIN_VALUE;
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1])
				counter++;
			else
				counter = 0;
			ans = Math.max(ans, counter);
		}
		return ans;
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			int n = nextInt();
			int arr[] = nextArr();

			System.out.println(missingNumber(arr));

		}
	}

}
