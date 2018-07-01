package fibonacci;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		System.out.println(fibo(N));
		
		}
	public static int fibo(int N){
		if (N==0)
			return 0;
		
		if(N==1)
			return 1;
		
		if(N==2)
			return (fibo(N-1)+fibo(N-2));
		return (fibo(N-1)+fibo(N-2));

		
		
		}
	
	
}
