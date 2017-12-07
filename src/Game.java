import java.awt.Graphics;

public class Game {
	private TicTacToeBoard b;
	public Game() {
		b = new TicTacToeBoard();
	}
	
	/**
	 * TODO
	 * draw board state onto the jpanel
	 * @param g
	 */
	public void draw(Graphics g) {
		
	}
	
	public void play(int x, int y) {
		if (b.xTurn) {
			b.playMove(x, y);
		}
		else {
			b.playOptimalMove();
		}
	}
}
