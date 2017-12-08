import java.awt.Graphics;

public class Game {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 800;
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
		int x, y;
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				switch(b.board[x][y]) {
				case 1: //o
					g.drawOval(x * WINDOW_WIDTH/3, y * WINDOW_HEIGHT/3, WINDOW_WIDTH/3, WINDOW_HEIGHT/3);
					break;
				case 2: //x
					g.drawLine(x * WINDOW_WIDTH/3, y * WINDOW_HEIGHT/3, (x + 1) * WINDOW_WIDTH/3, (y + 1) * WINDOW_HEIGHT/3);
					break;
				}
				g.drawLine(0, y * WINDOW_HEIGHT/3, WINDOW_WIDTH, y * WINDOW_HEIGHT/3);
			}
			g.drawLine(x * WINDOW_WIDTH/3, 0, x * WINDOW_WIDTH/3, WINDOW_HEIGHT);
		}
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
