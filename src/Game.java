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
		g.drawLine(160,0,160,450);
		g.drawLine(320, 0, 320, 450);
		g.drawLine(0, 160, 480, 160);
		g.drawLine(0, 320, 480, 320);
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
