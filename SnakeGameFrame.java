package snakegamemultiplayer;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

 
public class SnakeGameFrame extends  JFrame  implements SnakeGameConstants{
	  
  Image img; 
     
 SnakeGameFrame(){
	 
		 img=new ImageIcon(SnakeGameFrame.class.getResource("icon1.png")).getImage();
		 setTitle("Snake game");
		 setSize(SnakeGameFrameWidth,SnakeGameFrameHeight);
		 setResizable(false);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setIconImage(img ); 
		 add(new SnakeGameBoard());
		 setLocationRelativeTo(null);
		 setVisible(true); 
         
	 
 }}