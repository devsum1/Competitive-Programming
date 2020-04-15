package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Marriage {

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
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T-- > 0) {
			int n = s.nextInt();
			int kingn = 0;

			String ans = "";
			ArrayList<Integer> queen = new ArrayList<Integer>();
			int marry = -1;
			for (int i = 0; i < n; i++) {
				marry = -1;
				int size = s.nextInt();
				for (int j = 0; j < size; j++) {
					int item = s.nextInt();

					if (!queen.contains(item)) {
						queen.add(i, item);
						break;
					} else {
						marry = i;
					}
				}

			}

			if (marry == -1)
				System.out.println("OPTIMAL");
			else {
				System.out.println("IMPROVE");
				for (int i = 0; i < queen.size(); i++) {
					if (queen.get(i) == 0) {
						System.out.print(i + 1 + " " + marry + 1);
					break;
					}
				}
			}


		}
	}

}
