package wed;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		test3 t = new test3();
	}

	/**
	 * Create the frame.
	 */
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(248, 255, 147));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setBounds(83, 128, 117, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setBounds(235, 128, 130, 49);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("답은");
		lblNewLabel.setBounds(86, 211, 61, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(35, 30, 176, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(223, 30, 176, 68);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(144, 198, 152, 43);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		int num1, num2, ans;
		if(!textField.getText().equals("") && !textField_1.getText().equals("")) {
			num1 = Integer.parseInt(textField.getText());
			num2 = Integer.parseInt(textField_1.getText());
			ans = num1 + num2;
			textField_2.setText(Integer.toString(ans));
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				num1 = Integer.parseInt(textField.getText());
				num2 = Integer.parseInt(textField_1.getText());
				ans = num1 + num2;
				textField_2.setText(Integer.toString(ans));
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				num1 = Integer.parseInt(textField.getText());
				num2 = Integer.parseInt(textField_1.getText());
				ans = num1 - num2;
				textField_2.setText(Integer.toString(ans));
			}
		});
		
		setVisible(true);
	}
}
