package wed;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.orange);
		panel.add(new JLabel("나의 첫번째 GUI"));
		frame.setTitle("첫번째 GUI");
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(800, 800*3/4);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
