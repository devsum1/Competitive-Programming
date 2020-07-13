import java.io.*;
import java.util.*;

public class TextEditor {

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

	public static void left(String s) {
		// First left non repeating character
		int arr[] = new int[256];
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++)
			arr[s.charAt(i)]++;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				ans = Math.min(ans, s.indexOf((char) i));
			}

		}

		System.out.println(ans == Integer.MAX_VALUE ? -1 : s.charAt(ans) + "");

	}
	public static void main(String[] args) throws IOException {
		Stack<String> st = new Stack<String>();
		st.push("");
		int T = nextInt();
		while (T-- > 0) {

			String input[] = br.readLine().split(" ");

			int choice = Integer.parseInt(input[0]);
			int operation = 0;
			if (choice != 4 && choice != 1)
				operation = Integer.parseInt(input[1]);

			if (choice == 1) {
				st.push(st.peek() + input[1]);

			} else if (choice == 2) {
				String curr = st.peek().substring(0, st.peek().length() - operation);
				st.push(curr);
			} else if (choice == 3) {
				if (!st.isEmpty())
					System.out.println(st.peek().charAt(operation - 1));
				else
					System.out.println("");
			} else {
				if (!st.isEmpty())
					st.pop();
			}
			System.out.println(st.peek());
			left(br.readLine());
		}
	}

}
