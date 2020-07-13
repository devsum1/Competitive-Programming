package test;

import java.io.*;
import java.util.*;

public class Saurabh {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int a = 1; a <= T; a++) {

			int n = s.nextInt();
			int k = s.nextInt();

			int ans = 0;

			ArrayList<Integer> prices = new ArrayList<Integer>();

			for (int i = 0; i < n; i++)
				prices.add(s.nextInt());

			Collections.sort(prices);

			for (int i = 0; i < prices.size(); i++) {
				k -= prices.get(i);
				if (k < 0)
					break;
				else
					ans++;
			}

			System.out.println("Case #" + a + ": " + ans);

		}
	}

}
