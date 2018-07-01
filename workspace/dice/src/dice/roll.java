package dice;

import java.util.ArrayList;

public class roll {

	public static void main(String[] args) {
		getBoardPath(10,0);
	

	}
	
	public static ArrayList<String> getBoardPath(int end,int curr){
		if(curr==end){
			ArrayList<String> baseResult=new ArrayList<String>();
			return baseResult;
			
		}
		
		ArrayList<String> myResult=new ArrayList<>();
		ArrayList<String> recResult=null;
		
		for(int dice=1;dice<=6;dice++){
			recResult=getBoardPath(end,curr+dice);
			for(int j=0;j<recResult.size();j++){
				myResult.add(dice+recResult.get(j));
				
			}
		}
		return myResult;
	}

}
