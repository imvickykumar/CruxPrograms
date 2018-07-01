package practise;

public class poi {

	public static void main(String[] args) {
		int[] arr={10,200,30,40,50};
		System.out.println(search(arr,200));
	
	
	

}
	public static int search(int[] arr,int data)
	{
	    for(int i=0;i<arr.length;i++){
		if (arr[i]==data)
		{
			return i;
		}
		return  i;
//		System.out.println(arr[3]);
//		System.out.println(max(arr));
//		int left=0;
//		int right=arr.length-1;
//		while(left<=right){
//			int temp=arr[left];
//			arr[left]=arr[right];
//			arr[right]=temp;
//			left++;
//			right--;
//		}
//		System.out.println(arr[3]);

	}
//	public static int max(int [] arr){
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]>max){
//				max=arr[i];
//			}
//		}
//		return max;
	
	
	
	
	
}}


