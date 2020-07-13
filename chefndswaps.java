import java.io.*;
import java.util.*;



public class chefndswaps {

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

	public static int[] randomArr(int size) {
		int arr[] = new int[size];
		Random random = new Random();
		for (int a = 0; a < arr.length; a++)
			arr[a] = random.nextInt(1000000000);

		return arr;
	}

	public static int[] randomArr1(int size) {
		int arr[] = new int[size];
		Random random = new Random();
		for (int a = 0; a < arr.length; a++)
			arr[a] = random.nextInt(999999999);

		return arr;
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
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		StringBuilder ans = new StringBuilder();
		s: while (T-- > 0) {
			
			int n = nextInt();

			int arr[] = nextArr();
			int brr[] = nextArr();

			TreeMap<Integer, Integer> hash = new TreeMap<Integer, Integer>();
			TreeMap<Integer, Integer> hash1 = new TreeMap<Integer, Integer>();

			for (int i = 0; i < arr.length; i++) {
				if (hash.containsKey(arr[i])) {
					hash.put(arr[i], hash.get(arr[i]) + 1);
					hash1.put(arr[i], hash.get(arr[i]) + 1);
				} else {
					hash.put(arr[i], 1);
					hash1.put(arr[i], 1);
				}

				if (hash.containsKey(brr[i]))
					hash.put(brr[i], hash.get(brr[i]) - 1);
				else
					hash.put(brr[i], -1);
			}

			int replacement = 0;
			long bigans = 0;

			for (int i : hash.values()) {
				// For odd number of element ocurrence
				i = Math.abs(i);
				if (i % 2 != 0) {
					System.out.println(-1);
					ans.append(-1 + "\n");
					continue s;
				}
				replacement += i;
			}
			// For equal number of element ocurrence

			if (replacement == 0) {
				System.out.println(0);
				ans.append(0 + "\n");
				continue;
			} else {
				replacement /= 4;
				int possible = Collections.min(hash.keySet());

				for (int j : hash.keySet()) {

					if (replacement <= 0)
						break;

					if (Math.abs(hash.get(j)) == 0)
						continue;

					int minchoice = Math.min(replacement, Math.abs(hash.get(j)) / 2);

					bigans += Math.min((long) minchoice * j, (long) possible * 2);
					replacement -= minchoice;

				}
				System.out.println(bigans);
				ans.append(bigans + "\n");

			}


		}

	}

}

