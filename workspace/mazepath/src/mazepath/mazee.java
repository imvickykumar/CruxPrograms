package mazepath;

public class mazee {

	public static void main(String[] args) {
		System.out.println(getMazePath(2, 2, 0, 0));

	}
	public static void printMazePath(int er,int ec,int cr,int cc, char path){
		if(er==cr && ec==cc){
			return ;
		}
		if(cr>er||cc>ec){
			return ;
		}
		printMazePath(er, ec, cr, cc,path+"h");
		printMazePath(er, ec, cr, cc,path+"h");
		
		
		System.out.println(count);
		
		 
	
	public static int getMazePath(int er,int ec,int cr,int cc){
		if(er==cr && ec==cc){
			return 1 ;
		}
		if(cr>er||cc>ec){
			return 0 ;
		}
		int count=0;
		count=count + getMazePath(er,ec,cr,cc+1);
		count=count + getMazePath(er, ec, cr+1, cc);
		return count;
	}
	

}
