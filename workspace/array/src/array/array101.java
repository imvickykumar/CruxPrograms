package array;

import java.util.Scanner;

public class array101 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		
		int[] arr;
		System.out.println("enter the length of array\n");
		int n=s.nextInt();
		arr=new int[n];
//		arr[0]=2;
//		arr[1]=10;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
////		System.out.println(arr[0]+arr[4]);
////		
//		
//		System.out.println("====================================");
//		
//		
//		System.out.println(arr.length);
//		
//		System.out.println("=====================================");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the number :\n"+i);
			arr[i]=s.nextInt();
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
