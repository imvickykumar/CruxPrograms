package sorted;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one={2,6,8,10};
		int[] two={1,4,7,9,15,18};
		System.out.println(merge(one,two));
		
		
	}
	public static int[] merge(int[] one,int[] two){
			int i=0,j=0,k=0;
			int[] sorted= new int[one.length+two.length];
			while(i<one.length&&j<two.length){
				if(one[i] <two[j]){
					sorted[k]=one[i];
					i++;
					k++;
				}
			}
			while(i<one.length){
				sorted[k]=one[i];
				i++;
				k++;
				
			}
			while(j<two.length){
				sorted[k]=two[j];
				j++;k++;
			}
			return sorted;
		
	}

}
