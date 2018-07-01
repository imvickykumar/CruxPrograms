package binarytodecimal;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class usingfunc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		System.out.println(octaltobinary(N));
		

	}
	public static int octaltobinary(int N){
	int a=System.out.println(dectobin(N));
	return a;
		
	

}
	public static int octaltodec(int N){
		int pow=1;
	int rem=0;
	int dec=0;
	while(N!=0){
		rem=N%10;
		dec=dec+rem*pow;
		N=N/10;
		pow*=8;
		}
	return dec;
}
	public static int dectobin(int N){
		int pow=1;
	int rem=0;
	int bin=0;
	while(N!=0){
		rem=N%2;
		bin=bin+rem*pow;
		N=N/2;
		pow*=2;
		}
	return bin;
	}
}
