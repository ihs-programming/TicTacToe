import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Window extends JPanel implements MouseListener {
	private Game game;
	public Window(Game g) {
		this.setSize(480,456);
		this.addMouseListener(this);
		game = g;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.draw(g);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(480, 456);
	}

	/**
	 * TODO
	 * play human move and computer move when someone clicks
	 * 
	 * note, event.getX() and event.getY() may be useful...
	 * also, note that the board should have dimensions 480 by 456
	 */
	@Override
	public void mousePressed(MouseEvent event) {
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
