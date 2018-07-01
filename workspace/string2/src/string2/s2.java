package string2;

public class s2 {

	public static void main(String[] args) {
		String str;
		str="Hello";
		
		for(int i=0;i<=str.length()+1;i++){
			for(int j=i+1;j<=str.length();j++){
				System.out.println((str.substring(i,j)));

			}

	}

}
}
