import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Window extends JPanel implements MouseListener {
	private final Dimension DEFAULT_DIMENSION = new Dimension(480, 450);
	private Game game;
	public Window(Game g) {
		this.setSize(480,450);
		this.addMouseListener(this);
		game = g;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.draw(g);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return DEFAULT_DIMENSION;
	}

	/**
	 * TODO
	 * play human move and computer move when someone clicks
	 * 
	 * note, event.getX() and event.getY() may be useful...
	 * also, note that the board should have dimensions 480 by 450
	 */
	@Override
	public void mousePressed(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		int xrow = 0, yrow = 0;
		for (int i = 0; i < 3; i++) {
			if (x <= (i+1) * DEFAULT_DIMENSION.getWidth()/3) {
				xrow = i;
				break;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (y <= (i+1) * DEFAULT_DIMENSION.getHeight()/3) {
				yrow = i;
				break;
			}
		}
		game.play(xrow, yrow);
		this.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}
