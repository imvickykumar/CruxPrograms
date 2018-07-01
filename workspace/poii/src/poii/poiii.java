package poii;

public class poiii {

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
		else{
			return -1;
		}
		
	 }	

}
}