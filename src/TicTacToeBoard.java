
public class TicTacToeBoard {
	
	/*
	 * 0 means empty square
	 * 1 means o
	 * 2 means x
	 */
	public int[][] board = new int[3][3];
	
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
		return -1;
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
