import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Game {
	public static final int WINDOW_WIDTH = 480;
	public static final int WINDOW_HEIGHT = 450;
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
					g.setColor(Color.RED);
					g.drawOval(x * WINDOW_WIDTH/3, y * WINDOW_HEIGHT/3, WINDOW_WIDTH/3, WINDOW_HEIGHT/3);
					break;
				case 2: //x
					g.setColor(Color.BLUE);
					g.drawLine(x * WINDOW_WIDTH/3, y * WINDOW_HEIGHT/3, (x + 1) * WINDOW_WIDTH/3, (y + 1) * WINDOW_HEIGHT/3);
					break;
				}
				g.drawLine(0, y * WINDOW_HEIGHT/3, WINDOW_WIDTH, y * WINDOW_HEIGHT/3);
			}
			g.drawLine(x * WINDOW_WIDTH/3, 0, x * WINDOW_WIDTH/3, WINDOW_HEIGHT);
		}
		g.setColor(Color.GREEN);
		g.setFont(new Font("TimesRoman", Font.BOLD, 72));
		System.out.printf("DEBUG: Game state %d\n", b.getGameState());
		if (b.getGameState() == 1) {
			g.drawString("X won", WINDOW_HEIGHT/2, WINDOW_WIDTH/2);
		}
		if (b.getGameState() == 2) {
			g.drawString("O won", WINDOW_HEIGHT/2, WINDOW_WIDTH/2);
		}
	}
	
	public void play(int x, int y) {
		b.playMove(x, y);
		b.playOptimalMove();
	}
}
