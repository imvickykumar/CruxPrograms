package umesh;

import java.util.Scanner;

public class umeshdon {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
//		int m=s.nextInt();
//		System.out.println(n+m);
		int a=0;
		for(int i=2;i<=n/2;i++){ 
			if(n%i==0){
				System.out.println("Composite");
				break;
			}
			a++;
			}
		if(a==n/2-1)
			System.out.println("Prime");
		}

	}


