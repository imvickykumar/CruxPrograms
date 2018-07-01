package array102swap;

import java.util.Scanner;

public class arrayswap102 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr={50,40,30,20,10};
		int i=0;
		int j=2;
		swap(arr, i, j);
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		System.out.println(arr[i]+","+arr[j]);
	}

}
