package primefind;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class primo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=2;i<=N;i++){
			boolean flag=true;
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println(i);
				}
		}
		


	}

}
