package test;

class CF631B {

	static int N = 100050;

	static int[] lpf = new int[N];
	static int[] mobius = new int[N];

	static void least_prime_factor() {
		for (int i = 2; i < N; i++)

			if (lpf[i] == 0) {
				for (int j = i; j < N; j += i)
					if (lpf[j] == 0)
						lpf[j] = i;
			}
	}


	static void Mobius() {
		for (int i = 1; i < N; i++) {

			// If number is one
			if (i == 1)
				mobius[i] = 1;
			else {

				if (lpf[i / lpf[i]] == lpf[i])
					mobius[i] = 0;

			else
					mobius[i] = -1 * mobius[i / lpf[i]];
			}
		}
	}

	static int gcd_pairs(int a[], int n) {
		// To store maximum number
		int maxi = 0;

		// To store frequency of each number
		int[] fre = new int[N];

		// Find frequency and maximum number
		for (int i = 0; i < n; i++) {
			fre[a[i]]++;
			maxi = Math.max(a[i], maxi);
		}

		least_prime_factor();
		Mobius();

		// To store number of pairs with gcd equals to 1
		int ans = 0;

		// Traverse through the all possible elements
		for (int i = 1; i <= maxi; i++) {
			if (mobius[i] == 0)
				continue;

			int temp = 0;
			for (int j = i; j <= maxi; j += i) {
				temp += fre[j];

			}

			ans += temp * (temp - 1) / 2 * mobius[i];
		}

		// Return the number of pairs
		return ans;
	}

// Driver code 
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		int n = a.length;

		// Function call
		System.out.print(gcd_pairs(a, n));
	}
}

// This code is contributed by PrinciRaj1992 
