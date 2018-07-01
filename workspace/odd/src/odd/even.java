package odd;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int  digit, oddSum, evenSum, rev, count = 1;

        rev = oddSum = evenSum = 0;
        
        while (N > 0) {
            digit = N % 10;
            rev = (rev * 10) + digit;
            N = N / 10;
    }
        N = rev;
        
        while (N > 0) {
            digit = N % 10;
            if (count % 2 == 0) {
                    evenSum = evenSum + digit;
            } else {
                    oddSum = oddSum + digit;
            }
            N = N / 10;
            count++;
    }
        System.out.println(oddSum);
        System.out.println(evenSum);




	}

}
