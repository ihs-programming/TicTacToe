import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		Window w = new Window(g);
		JFrame f = new JFrame("TicTacToe");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(w);
		f.pack();
		
		f.setVisible(true);
	}
}
