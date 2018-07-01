package hcf;

import java.util.Scanner;

public class hhcf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n1");
		int N1=s.nextInt();
        System.out.println("enter N2");

		int N2=s.nextInt();
		int rem=1;
		if(N1>N2){
			while( rem!=0)
			{
				int rem2;
				 rem=N1%N2;
				 rem2=N2%rem;
		    }
			System.out.println(rem);
		}
		if(N2>N1){
			while( rem!=0)
			{
				int rem2;
				 rem=N2%N1;
				 rem2=N1%rem;
		    }
			System.out.println(rem);
		}
	}

}
