import java.util.ArrayList;

public class TicTacToeBoard {
	
	/*
	 * 0 means empty square
	 * 1 means o
	 * 2 means x
	 */
	public static int[][] board = new int[3][3];
	
	/**
	 * player o plays first
	 */
	public boolean xTurn = false;
	
	public TicTacToeBoard () {
		
	}
	
	/*
	 * TODO figure this out
	 * 0 means game is not over
	 * 1 means o won
	 * 2 means x won
	 */
	public int getGameState() {
		for(int a = 0; a < 3; a++)
		{
			for(int b = 0; b < 3; b++)
			{
				int val = board[a][b];
				if(val == 0)
					continue;
				if(checkVert(a, b, val)) return val;
				if(checkHorz(a, b, val)) return val;
			}
		}
		return checkDiag();
	}
	private static boolean checkVert(int a, int b, int val)
	{
		if(a == 0 || a == 2)
		{
			if(board[a][b] == val) return true;
			return false;
		}
		if(board[a][b] != val)
		{
			return false;
		}
		return checkVert(a - 1, b, val) && checkVert(a + 1, b, val);
	}
	private static boolean checkHorz(int a, int b, int val)
	{
		if(b == 0 || b == 2)
		{
			if(board[a][b] == val) return true;
			return false;
		}
		if(board[a][b] != val)
		{
			return false;
		}
		return checkHorz(a, b - 1, val) && checkHorz(a, b + 1, val);
	}
	private static int checkDiag()
	{
		if(board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2])
		{
			return board[0][0];
		}
		if(board[0][2] != 0 && board[0][2] == board[1][1] && board[0][0] == board[2][0])
		{
			return board[0][2];
		}
		return 0;
	}
	
	/**
	 * TODO
	 * Ensure that played move is legit
	 * @param x
	 * @param y
	 */
	public void playMove(int x, int y) {
	}
	
	/**
	 * TODO
	 * Currently looks for playable move
	 */
	public void playOptimalMove() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (board[x][y] == 0) {
					playMove(x, y);
				}
			}
		}
	}
}
