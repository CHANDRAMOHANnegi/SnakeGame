package snakegamemultiplayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import commonUtils.Playsong;
import commonUtils.SnakeControls;
import cpuSnake.CpuControls; 
 
public class SnakeSplash extends JWindow implements SnakeGameConstants {

	private JPanel contentPane;
//    SnakeGameFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					SnakeSplash frame = new SnakeSplash();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Playsong.playsong(SPLASHSONG);
		 
	}

	/**
	 * Create the frame.
	 * 
	 */ 
	
	public SnakeSplash() {
		
		
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SNAKE GAME");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(10, 11, 640, 27);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		
		
		   try {
			Image image = ImageIO.read(SnakeSplash.class.getResource("splash1.png"));
			Image img=image.getScaledInstance(620, 440, Image.SCALE_SMOOTH);
		
		
			
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(img));
		lblNewLabel_1.setBounds(10, 38, 453, 413);
		//lblNewLabel_1.add(new ImageIcon(image));
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener((l)->{new SnakeGameFrame().startgame(); new CpuControls();new SnakeControls(); this.setVisible(false);this.dispose();
	    Playsong.stopsong(SPLASHSONG);});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(512, 63, 89, 39);
		contentPane.add(btnNewButton);
		
		
		
		JComboBox comboBox = new JComboBox();
		 
		comboBox.addItem("EASY");	comboBox.addItem("MEDIUM");
		comboBox.addItem("HARD");		comboBox.setBounds(484, 161, 144, 27);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(523, 362, 2, 2);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("LEVEL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(484, 138, 144, 27);
		contentPane.add(lblNewLabel_2);
		
	 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                     
		   
	}
}