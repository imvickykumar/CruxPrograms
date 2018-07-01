package dec;

public class bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec=32;
		System.out.println(dectobin(dec));
		

	}
	public static int dectobin(int dec){
		int pow=1;
		int bin=0;
		while(dec!=0){
			
			int rem = (dec%2)*(pow);
		    bin= bin  + rem;
			dec=dec / 2;
 			pow *= 10;
 			
			
			
			
		}
		return bin;
	}

}
