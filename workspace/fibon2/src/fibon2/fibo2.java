package fibon2;

import java.util.Scanner;

public class fibo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int N=s.nextInt();
	    int sum=0;
	    int a=0;
	    int b=1;
	    System.out.println(a);
	    System.out.println(b);
	    sum=a+b;
	    while(sum<=N){
	    	System.out.println(sum);

	    	a=b;
	    	b=sum;
	    	sum=b+a;
	    	
	    	
	    	
	    }

	}

}
