package snakegamemultiplayer;

import java.awt.Color;
import java.awt.EventQueue;
//import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

 
public class SnakeGameFrame extends  JFrame  implements SnakeGameConstants{
	  
  Image img; 

  private JPanel contentPane;
  SnakeGameFrame frame;
  public void startgame(){
	   
	  EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					 frame=new SnakeGameFrame(""); 
					 frame.setVisible(true); 
						
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
  }
  
  
  SnakeGameFrame(){
	 
  } 		
  
 SnakeGameFrame(String s){
	 
		 img=new ImageIcon(SnakeGameFrame.class.getResource("icon1.png")).getImage();
		 
		 setTitle("Snake game");
		 setSize(SnakeGameFrameWidth,SnakeGameFrameHeight);
		 setResizable(false);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
     	 setIconImage(img );
     	 setLocationRelativeTo(null);
   
//		 contentPane=new JPanel();
//		 setContentPane(contentPane);

//contentPane.setLayout(new FlowLayout());
   
//			JLabel lblNewLabel = new JLabel("SNAKE GAME");
//			lblNewLabel.setBackground(Color.RED);
//			lblNewLabel.setBounds(10, 11, 640, 27);
//			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
//			lblNewLabel.setForeground(Color.BLACK);
//			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
//			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//			contentPane.add(lblNewLabel);
			 
//			contentPane.
  			add(new SnakeGameBoard());
			
 }}




/**
 * 
 * EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					SnakeSplash frame = new SnakeSplash();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
 * 
 * /
 */
