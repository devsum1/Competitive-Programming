public class pattern {

	public static void main(String[] args) {

		int t = 5;

		for (int i = 1; i <= t; i++) {
			int spaces = t - i;

			for (int j = 1; j <= spaces; j++)
				System.out.print(" ");

			for (int k = 1; k <= i; k++)
				System.out.print(k);

			for (int k = i - 1; k >= 1; k--)
				System.out.print(k);

			System.out.println();

		}
	}
}
