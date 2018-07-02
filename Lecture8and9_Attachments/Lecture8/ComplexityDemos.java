package Lecture8;

public class ComplexityDemos {
	public static long start = 0;
	public static long end = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] one = { 2, 6, 8, 10 };
		// int[] two = { 1, 4, 7, 9, 15, 18 };
		// // int[] ans = merge(one, two);
		// // for (int i = 0; i < ans.length; i++) {
		// // System.out.println(ans[i]);
		// // }
		//
		// int[] arr = { 10, 30, 80, 90, 50, 70 };
		// // int[] ans = mergeSort(arr, 0, arr.length - 1);
		// //
		// // for (int i = 0; i < ans.length; i++) {
		// // System.out.println(ans[i]);
		// // }
		//
		// quickSort(arr, 0, arr.length - 1);
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }

//		int N = 1000000;
//		int[] arr = new int[N];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = N - i;
//		}
//		startAlgo();
//		mergeSort(arr, 0, arr.length - 1);
//		System.out.println("The merge sort took time " + endAlgo() + " milliseconds");
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = N - i;
//		}
//		startAlgo();
//		bubbleSort(arr);
//		System.out.println("The bubble sort took time " + endAlgo() + " milliseconds");

//		System.out.println(power(2, 5));
//		SOE(50);
		
		int N= 1000000;
		startAlgo();
		SOE(N);
		System.out.println("The seive took time " + endAlgo() + " milliseconds");

		startAlgo();
		printPrimes(N);
		System.out.println("The print prime took time " + endAlgo() + " milliseconds");
	}

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int[] sorted = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				sorted[k] = one[i];
				i++;
				k++;

			} else {
				sorted[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			sorted[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			sorted[k] = two[j];
			j++;
			k++;
		}

		return sorted;
	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] base = new int[1];
			base[0] = arr[low];
			return base;
		}

		int mid = (low + high) / 2;
		int[] one = mergeSort(arr, low, mid);
		int[] two = mergeSort(arr, mid + 1, high);
		int[] sorted = merge(one, two);
		return sorted;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int left = low, right = high;
		int mid = (left + right) / 2;
		int pivot = arr[mid];

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quickSort(arr, low, right);
		quickSort(arr, left, high);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int power = 1;
		if (n % 2 == 0) {
			int pnb2 = power(x, n / 2);
			power = pnb2 * pnb2;
		}
		if (n % 2 != 0) {
			int pnb2 = power(x, n / 2);
			power = pnb2 * pnb2 * x;
		}

		return power;
	}
	
	public static void SOE(int N){
		boolean[] primes=new boolean[N+1];
		for(int i=0;i<primes.length;i++){
			primes[i]=true;
		}
		int n2test=2;
		while(n2test*n2test<=N){
			if(primes[n2test]){
				for(int multiplier=2;multiplier*n2test<=N;multiplier++){
					primes[n2test*multiplier]=false;
				}
			}
			n2test++;
		}
		
		for(int i=2;i<primes.length;i++){
			if(primes[i]){
				System.out.println(i);
			}
		}
	}
	
	public static void printPrimes(int N) {
		int start = 2;
		int end = N;

		boolean flag = true;
		while (start <= end) {
			int divisor = 2;
			flag = true;

			while (divisor < start) {
				if (start % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}

			if (flag == true) {
				// System.out.println(start);
			}
			start++;
		}

	}

	public static String getConcatenatedValues(int N) {
		String retVal = "";

		for (int i = 0; i <= N; i++) {
			retVal = retVal + i + "\n";
		}

		return retVal;
	}

	public static String getConcatenatedValuesBtr(int N) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= N; i++) {
			sb.append(i + "\n");
		}

		return sb.toString();
	}

	// For space complexity
	public static int getFactIterative(int n) {
		int rv = 1;

		while (n != 0) {
			rv *= n;
			n--;
		}

		return rv;
	}

	// For space complexity
	public static int getFactRecursive(int n) {
		if (n == 1) {
			return 1;
		}

		int factnm1 = getFactRecursive(n - 1);
		int factn = factnm1 * n;

		return factn;
	}
}
