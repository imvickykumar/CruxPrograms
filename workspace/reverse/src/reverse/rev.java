package reverse;

import java.util.Scanner;

public class rev {

	public static void main(String[] args) {
		int rem;
		int rev=0;
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		while(N!=0){
			rem=N%10;
			rev=rev*10+rem;
			N=N/10;
			
		}
		System.out.println(rev);

		

	}

}
