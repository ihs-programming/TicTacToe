import javax.swing.JFrame;
public class Main {
	public static void main(String[] args) {
		JFrame w = createWindow();
	}
	static JFrame createWindow() {
		JFrame window = new JFrame("Tic-Tac-Toe");
		window.setSize(600, 600);
		window.setVisible(true);
		return window;
	}
}