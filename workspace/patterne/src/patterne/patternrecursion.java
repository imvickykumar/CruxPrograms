package patterne;

public class patternrecursion {

	public static void main(String[] args) {
		pattern(5);

	}
	public static void pattern(int n){
		if(n!=0){
			char fn="*";
			System.out.println("*");
		}
		pattern(n-(n-1));

		
		
	}

}
