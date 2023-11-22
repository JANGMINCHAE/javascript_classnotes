package wed;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class test5 extends JFrame {

	private JPanel contentPane;
	private JLabel contentLabel;
	private JButton contentBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		test5 t = new test5();
	}

	/**
	 * Create the frame.
	 */
	public test5() {
		setTitle("Label Test");
		setSize(400,250);
		
		contentPane = new JPanel();
		contentLabel = new JLabel("Dog");
		ImageIcon icon = new ImageIcon("/Users/jmc/Downloads/dog.jpeg");
		contentLabel.setIcon(icon);
		
		contentBtn = new JButton("자세한 정보를 보려면 클릭하세요.");
		contentPane.add(contentLabel);
		contentPane.add(contentBtn);
		add(contentPane);
		setVisible(true);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
