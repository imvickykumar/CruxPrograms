package patterntree;

import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int i,j;
		int k=1;
		for (i=1;i<=N;i++)
		{
			for(j=0;j<i;j++)
			{

				System.out.print(k+++"\t");
			}
			System.out.println();
		}
		

	}

}
