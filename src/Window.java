import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Window extends JPanel implements MouseListener {
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
		return new Dimension(480, 450);
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
		if (x >= 0 && x <= 480) {
		} else {
			x = 480;
		}
		if (y >= 0 && y <= 480) {
		} else {
			y = 480;
		}
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
