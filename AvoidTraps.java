import java.util.*;
import java.io.*;

public class AvoidTraps {

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

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {
			int input[] = nextArr();

			int r1 = input[0];
			int r2 = input[1];

			int N = nextInt();
			Boolean prime[] = new Boolean[N + 1];
			for (int i = 0; i < prime.length; i++)
				prime[i] = false;
			int primeCount[] = new int[N + 1];
			int count = 0;

			for (int i = 2; i < prime.length; i++) {
				if (!prime[i]) {
					count++;
					for (int j = i; j < N; j += i)
						prime[j] = true;

				}
				primeCount[i] = count;
			}


			String n = next();
			int i = 0;
			int ans = 0;
			Boolean flag = false;

			while (i < N - 1) {
				int special = 0;
				int a = 0;
				int b = 0;

				if (i + 1 < N && n.charAt(i + 1) == '#')
					a = i + 1;

				if (i + 2 < N && n.charAt(i + 2) == '#')
					b = i + 2;

				if (primeCount[i + 1] / (i + 1) >= r1 / r2) {

					if (i + primeCount[i] < N && n.charAt(i + primeCount[i]) == '#')
						special = i + primeCount[i + 1];

				}


				int optimal = Math.max(special, Math.max(a, b));
				
				if (optimal == 0) {
					flag = true;
					break;
				} else {
					i += (optimal - i);
					ans++;
				}


			}
			System.out.println(flag ? "No way!" : ans);
		}
	}

}
