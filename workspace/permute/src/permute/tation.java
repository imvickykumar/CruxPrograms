package permute;

import java.util.ArrayList;

public class tation {

	public static void main(String[] args) {
		System.out.println(getPermutations("abc"));

	}
	public static ArrayList<String> getPermutations(String str){
		if(str.length()==0){
			ArrayList<String>baseResult=new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String>myResult=new ArrayList<String>();
		ArrayList<String>recResult=getPermutations(ros);
		
		for(int i=0;i<recResult.size();i++){
			String recString
		}
		return myResult;
	}

}
