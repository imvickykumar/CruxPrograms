package prime;

import java.util.Scanner;

class PrimeExample {
	public static void main(String args[]) {
		int i, m = 0, flag = 0;
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Prime");
	}
}