package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class tryit {
	static ArrayList<Integer> sol = new ArrayList<>();
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

	public static int josephus(ArrayList<Integer> arr, int n, int k) {
		if (arr.size() == 1)
			return arr.get(0);

		System.out.println(k);

		arr.remove(k);
		k = (k + k) % n;
		if (k == 0)
			k = n;



		return josephus(arr, n, k);
	}
	public static void main(String[] args) throws IOException {
	
	int T = nextInt();
	while (T-- > 0) {
		
			int arr[] = nextArr();
			int n = arr[0];
			int k = arr[1];

			ArrayList<Integer> sol = new ArrayList<>();
			for (int i = 1; i <= n; i++)
				sol.add(i);

			System.out.println(josephus(sol, n, k));

			
	}
}


}
