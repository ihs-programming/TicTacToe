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
	//OH BABY
	public int getGameState() {
		//oh shit its about to get LIT
		if(board[0][0] != 0 && board[0][0] == board[0][1] && board[0][0] == board[0][2]) return board[0][0];
		if(board[0][0] != 0 && board[0][0] == board[1][0] && board[0][0] == board[2][0]) return board[0][0];
		if(board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) return board[0][0];
		if(board[1][0] != 0 && board[1][0] == board[1][1] && board[1][0] == board[1][2]) return board[1][0];
		if(board[2][0] != 0 && board[2][0] == board[2][1] && board[2][0] == board[2][2]) return board[2][0];
		if(board[0][1] != 0 && board[0][1] == board[1][1] && board[0][1] == board[2][1]) return board[0][1];
		if(board[0][2] != 0 && board[0][2] == board[1][2] && board[0][2] == board[2][2]) return board[0][2];
		if(board[2][0] != 0 && board[2][0] == board[1][1] && board[2][0] == board[0][2]) return board[2][0];
		return 0;
	}
	
	/**
	 * TODO
	 * Ensure that played move is legit
	 * @param x
	 * @param y
	 */
	public void playMove(int x, int y) {
		if(x > 2 || x < 0) {
			System.out.println(x + " is not valid in X");
			return;
		}
		else if(y > 2 || y < 0){
			System.out.println(y + " is not valid in Y");
			return;
		}
		if (board[x][y] != 0) {
			System.out.println("Already played there");
			return;
		}
		if(this.xTurn) {
			this.board[x][y] = 2;
			this.xTurn = !xTurn;
		}
		else {
			this.board[x][y] = 1;
			this.xTurn = !xTurn;
		}
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
					return;
				}
			}
		}
	}
}
