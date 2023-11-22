package wed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class test2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnpanel = new JPanel();
		JLabel label = new JLabel("나의 첫 번째 GUI");
		
		JButton btn1 =new JButton("클릭1");
		JButton btn2 =new JButton("클릭2");
		JButton btn3 =new JButton("종료");
		
		JTextArea textarea = new JTextArea();
		panel.setLayout(new BorderLayout());
		
		frame.add(panel);
		panel.setBackground(Color.orange);
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnpanel, BorderLayout.WEST);
		panel.add(textarea, BorderLayout.CENTER);
		
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textarea.append("신기하다\n");
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText(textarea.getText());
			}
			
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		btnpanel.add(btn1);
		btnpanel.add(btn2);
		btnpanel.add(btn3);

		panel.add(new JLabel("나의 첫번째 GUI"));
		frame.setTitle("첫번째 GUI");
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(800, 800*3/4);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

