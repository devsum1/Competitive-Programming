import java.io.*;
import java.util.*;

public class chefSteps {

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
			int row = input[0];
			int col = input[1];
			int mat[][] = new int[row][col];
			int x = input[2];
			int y = input[3];

			StringBuilder ans = new StringBuilder();
			int curr = 0;
			
			
			
			if (row == 1 && col == 1) {
				ans.append(Math.min(x, y));
				System.out.println(ans);
				continue;
			}
			
			for (int i = 0; i < col; i++) {
				int maxUpto = 0;
				if (curr == 0) {
					int res = y - 2;
					if (res <= 0)
						res = y;
					maxUpto = Math.min(x, res);
				} else {
					maxUpto = Math.min(y - curr, x);
				}
				curr = maxUpto;
				if (i != col - 1)
				ans.append(maxUpto + " ");
				else
					ans.append(maxUpto);
			}

			int result = 0;

			if (ans.length() == 1) {
				for (int i = 0; i < row; i++) {
					if (i % 2 == 0)
						result += Integer.parseInt(ans.toString());
					else
						result += y - Integer.parseInt(ans.toString());
				}
				
				System.out.println(result);
				continue;
			}
			for (int i = 0; i < row; i++) {
				String arr[] = ans.toString().split(" ");
				if(i%2!= 0) {
					int m = 0;
				
					for (int k = arr.length-1; k >=0; k--) {
						result += Integer.parseInt(arr[k]);
					}
				}
				else {
					for (int j = 0; j < arr.length; j++) {

						result += Integer.parseInt(arr[j]);

					}
				}
				

			}
			System.out.println(result);


		}
	}

}
