package twodarray;

import java.util.Scanner;

public class scanning {

	public static void main(String[] args){
		 int[][] arr={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
	     display(arr);
	     spiralPrint(arr);

	}
//		int[][]arr=takeInput();
		
		

//	}
	
//	public static int[][] takeInput(){
//		Scanner s=new Scanner(System.in);
//		int[][] arr;
//		System.out.println("enter the number of rows");
//		int rows=s.nextInt();
//		arr=new int[rows][];
//		for (int row=0;row < arr.length; row++){
//				System.out.println("enter the number of columns for row"+row);
//				int cols=s.nextInt();
//				arr[row]=new int[cols];
//				for(int col=0;col<arr[row].length;col++){
//						System.out.println("enter the value at row"+col);
//						arr[row][col]=s.nextInt();
//				}
//
//				}
//		return arr;
//
//
//		
//		
//	}			

		public static void display(int[][] arr){
			for(int row=0;row<arr.length;row++){
				for(int col=0;col<arr[row].length;col++){
					System.out.print(arr[row][col]+" ,  ");
				}
				System.out.println("");
			}
		}
		//spiral print
		public static void spiralPrint(int[][] arr){
			int top=0;
			int left=0;
			int right=arr[top].length-1;
			int bottom=arr.length-1;
			int count=(bottom+1)*(right+1);
			int dir=1;
					
					
					
					
					
					
					
					
					
					
		}

}
	

