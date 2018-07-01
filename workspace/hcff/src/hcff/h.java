package hcff;

import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		int N1, N2, t, x, y, hcf,lcm;
        Scanner scan = new Scanner(System.in);
		
        N1= scan.nextInt();
        N2= scan.nextInt();
		
        
        
		
        while(N2 != 0)
        {
            t = N1;
            N2 = N1%N2;
            N1 = t;
        }
		
        hcf = N1;
        lcm = (N1*N2)/hcf;
		
        System.out.print(lcm);
    }
		

}


