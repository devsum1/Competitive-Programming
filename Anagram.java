package test;
import java.io.*;
import java.util.*;

public class Anagram {

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
			System.out.println(arr[i]);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

//	public static int calci(int arr[][]) {
//
//		int ans = Integer.MIN_VALUE;
//		int sum;
//		for (int row = 1; row <= 4; row++) {
//			for (int col = 1; col <= 4; col++) {
//				sum = 0;
//				sum += arr[row][col];
//                
//				for(int k = row-1;k<=row+1;k+=2) {
//				for (int i = col - 1; i <= col + 1; i++) 
//					sum += arr[][i]+arr[row+1][i];
//				}
//				ans = Math.max(ans, sum);
//			}
//		}
//
//		return ans;
//	}
	public static String sort(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static void main(String[] args) throws IOException {

		String s = next();
		Boolean empty = false;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char search = ' ';
			if (ch == '{' || ch == '(' || ch == '[')
				st.push(ch);
			else if (ch == '}')
				search = '{';
			else if (ch == ')')
				search = '(';
			else if (ch == ']')
				search = '[';

			if (search != 'a') {
				if (st.empty()) {
					empty = true;
					break;
				}

				if (!st.empty() && st.peek() == search)
					st.pop();

			}
			System.out.println(st);
		}
		System.out.println(st.isEmpty() && !empty);
		
	}

}


