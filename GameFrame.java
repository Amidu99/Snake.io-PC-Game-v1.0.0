import javax.swing.*;

public class GameFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	GameFrame() {
		GamePanel panel = new GamePanel();
		this.add(panel);
		this.setTitle("Snake.io PC v1.0.0 ©- A$ | 2023");
		this.setIconImage(new ImageIcon("favicon.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}