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

		s: while (T-- > 0) {
			
			int n = nextInt();

			int arr[] = nextArr();
			int brr[] = nextArr();

			TreeMap<Integer, Integer> a = new TreeMap<Integer, Integer>();
			TreeMap<Integer, Integer> b = new TreeMap<Integer, Integer>();
			HashSet<Integer> u = new HashSet<Integer>();
			ArrayList<Integer> notbalanced = new ArrayList<Integer>();

			long ans = 0;

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (a.containsKey(arr[i]))
					a.put(arr[i], a.get(arr[i]) + 1);
				else
					a.put(arr[i], 1);

				if (b.containsKey(brr[i]))
					b.put(brr[i], b.get(brr[i]) + 1);
				else
					b.put(brr[i], 1);

				min = Math.min(min, Math.min(arr[i], brr[i]));
				u.add(arr[i]);
				u.add(brr[i]);
			}

			for (int i : u) {
				int occurinFirst = 0;
				int occurinSecond = 0;

				if (a.containsKey(i))
					occurinFirst = a.get(i);

				if (b.containsKey(i))
					occurinSecond = b.get(i);

				if (Math.abs((occurinFirst + occurinSecond)) % 2 != 0) {
					System.out.println(-1);
					continue s;
				}

				long occurence = Math.abs((occurinFirst - occurinSecond)) / 2;

				for (int j = 0; j < occurence; j++)
					notbalanced.add(i);

			}

			for (int i = 0; i < notbalanced.size() / 2; i++)
				ans += Math.min(notbalanced.get(i), min * 2);

			System.out.println(ans);

		}

	}

}

