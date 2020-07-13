import java.io.*;
import java.util.*;


class StringException extends Exception {
	StringException(String s) {
		super(s);
	}

}

class AlphaNumericException extends Exception {
	AlphaNumericException(String s) {
		super(s);
	}

}

public class ValidString {

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
		int count =0;
			int digit = 0;
		String s = next();
		try {
			Integer.parseInt(s);
			System.out.println("Valid Format");
		} catch (Exception e) {
			for (int i = 0; i < s.length(); i++) {
				try {
					Integer.parseInt(s.charAt(i) + "");
						digit++;
				} catch (Exception b) {
					count++;
				}
			}
			try {
				if( count == s.length()) 
						throw new StringException("Its a String");
					else if (digit == s.length())
						System.out.println("Valid Format");
				else 
					throw new AlphaNumericException("Its a AlphaNumeric");
				
			}catch(Exception z) {
				System.out.println(z);
			}

		

	}
}

}



}
