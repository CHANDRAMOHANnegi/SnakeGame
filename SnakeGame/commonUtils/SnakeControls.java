package commonUtils;
 
import javax.swing.JFrame; 
import snakegamemultiplayer.SnakeGameBoard;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;

public class SnakeControls extends JFrame {
  
	public SnakeControls() { 
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(1000, 5, 187, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SnakeGameBoard.sb.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Single Player");
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setEnabled(true);
		btnNewButton.setBounds(1000, 160, 187, 49);
		SnakeGameBoard.sb.add(btnNewButton);
		
		JButton btnPlayWithCpu = new JButton("Play with Cpu");
		btnPlayWithCpu.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		btnPlayWithCpu.setBounds(1000, 230, 187, 49);
		SnakeGameBoard.sb.add(btnPlayWithCpu);
		
		JButton btnMultiplayer = new JButton("MultiPlayer");
		btnMultiplayer.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		btnMultiplayer.setBounds(1000, 300, 187, 49);
		SnakeGameBoard.sb.add(btnMultiplayer);
		
		JButton btnNewButton_1 = new JButton("Start New Game");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1000, 78, 187, 49);
		SnakeGameBoard.sb.add(btnNewButton_1);
		
	}

}
