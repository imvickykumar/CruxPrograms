
public class nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean [4][4];
		countNQueens(board, 4);

	}
	public static int countNQueens(boolean[][] board,int row){
		if(row==board.length){
			return 1;
		}
		int count=0;
		for(int col=0;col<board[row].length;col++){
			if(isItSafe(board,row,col)){
				board[row][col]=true;
				count=count+countNQueens(board,row+1);
				board[row][col]=false;
			}
			
			
		}
		return count;
		
	}
	public static boolean isItSafe(boolean[][] board,int row,int col){
		for(int i
		
	}

}
