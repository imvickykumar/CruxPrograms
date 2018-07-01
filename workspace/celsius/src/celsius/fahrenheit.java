package celsius;

import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int b=(f-32);
		double c=(5.0/9)*(f-32);
		c=(int) c;
		while(f<=300)
		{
			System.out.println(c);
			f=f+20;
			
			
		}
		
		
		
	}
	
}
