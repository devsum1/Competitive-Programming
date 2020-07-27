import java.io.*;
import java.util.*;

public class MaxOfThree {

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
			ArrayList<Integer> nums = new ArrayList<Integer>();

			for (int i : arr)
				nums.add(i);

			int max = Collections.max(nums);
			int countMax = 0;
			int second = -1;

			for (int i : nums) {
				if (i == max)
					++countMax;
				else
					second = i;
			}

			if (countMax < 2)
				System.out.println("NO");
			else {
				System.out.println("YES");
				if (second == -1)
					System.out.println(max + " " + max + " " + 1 + " ");
				else
					System.out.println(max + " " + second + " " + 1);

			}
			
			


		}
	}


}