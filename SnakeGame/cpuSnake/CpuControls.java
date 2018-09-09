package cpuSnake;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import snakegamemultiplayer.Collisions;
import snakegamemultiplayer.SnakeGameBoard;
public class CpuControls extends JFrame {

	 
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	 
	public CpuControls() {
		 
		JLabel lblNewLabel = new JLabel("your Snake");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(10, -13, 193, 42);
		lblNewLabel.setToolTipText("YOUR SNAKE");
		SnakeGameBoard.sb.add(lblNewLabel);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblScore.setBounds(20, 32, 80, 27);
		
		SnakeGameBoard.sb.add(lblScore);
		
		textField = new JTextField();
		textField.setBounds(94, 25, 86, 34);
		textField.setText(Integer.toString(Collisions.getCpuscore()));
		SnakeGameBoard.sb.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Body Color");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 83, 100, 22);
		SnakeGameBoard.sb.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 79, 86, 34);
		SnakeGameBoard.sb.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 127, 86, 34);
		SnakeGameBoard.sb.add(textField_2);
		
		JLabel label_1 = new JLabel("your Snake");
		label_1.setToolTipText("YOUR SNAKE");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_1.setBounds(10, 251, 193, 42);
		SnakeGameBoard.sb.add(label_1);
		
		JLabel label_2 = new JLabel("Score");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(20, 304, 80, 27);
		SnakeGameBoard.sb.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 304, 86, 34);
		textField_3.setText(Integer.toString(Collisions.getYourscore()));
		SnakeGameBoard.sb.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(94, 360, 86, 34);
		SnakeGameBoard.sb.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(94, 405, 86, 34);
		SnakeGameBoard.sb.add(textField_5);
		
		JLabel label_3 = new JLabel("Body Color");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 364, 100, 22);
		SnakeGameBoard.sb.add(label_3);
		
		JLabel lblHeadColor = new JLabel("Head Color");
		lblHeadColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHeadColor.setBounds(10, 409, 100, 22);
		SnakeGameBoard.sb.add(lblHeadColor);
		
		JLabel label = new JLabel("Head Color");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 131, 100, 22);
		SnakeGameBoard.sb.add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 202, 89, 23);
		SnakeGameBoard.sb.add(btnNewButton);
		
		JButton btnPause = new JButton("Pause");
		btnPause.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPause.setBounds(114, 198, 79, 27);
		btnPause.setFocusable(false);
		SnakeGameBoard.sb.add(btnPause);
		
	}
}
