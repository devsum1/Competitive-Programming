import java.io.*;
import java.util.*;

public class ChefCard {

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
		StringBuilder ans = new StringBuilder();
		while (T-- > 0) {

			int n = nextInt();
			int chefscore = 0;
			int montyscore = 0;
			for (int i = 0; i < n; i++) {
				int score[] = nextArr();
				String arr[] = (score[0] + "").split("");
				String brr[] = (score[1] + "").split("");

				int cturn = 0, mturn = 0;
				for (String j : arr) {

					cturn += Integer.parseInt(j);
				}
				for (String j : brr)
					mturn += Integer.parseInt(j);

				if (cturn > mturn)
					chefscore++;
				else if (mturn > cturn)
					montyscore++;
				else {
					chefscore++;
					montyscore++;
				}

			}

			if (chefscore > montyscore)
				ans.append(0 + " " + chefscore + "\n");
			else if (montyscore > chefscore)
				ans.append(1 + " " + montyscore + "\n");
			else
				ans.append(2 + " " + montyscore + "\n");
		}
		System.out.println(ans);
	}

}
