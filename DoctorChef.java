import java.io.*;
import java.util.*;

public class DoctorChef {

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

			int arr[] = nextArr();
			int n = arr[0];
			int x = arr[1];

			int country[] = nextArr();
		
			Arrays.sort(country);

			int i = 0;
			int ans = 0;

			while (i < country.length) {
				if (country[i] < x) {
					if (country[i] * 2 >= x)
						x = country[i] * 2;
					ans++;
					i++;
				} else {
					while (x < country[i]) {
//						System.out.println(x);
						x = x * 2;
						ans++;
					}
					x = Math.min(country[i], x) * 2;
					i++;
					ans++;
				}
//				System.out.println(x);
			}
			System.out.println(ans);

		}
	}

}
