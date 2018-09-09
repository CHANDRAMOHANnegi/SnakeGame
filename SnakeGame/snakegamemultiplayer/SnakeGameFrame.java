package snakegamemultiplayer;

 
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
 
public class SnakeGameFrame extends  JFrame  implements SnakeGameConstants{
	  
  Image img; 

  private JPanel contentPane;
  SnakeGameFrame frame;
  
  public void startgame(){
	   
	  EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					 frame=new SnakeGameFrame("2018"); 
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
		 setResizable(true);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
     	 setIconImage(img );
     	 setLocationRelativeTo(null);
    
  			add(SnakeGameBoard.sb);
			
 }}

 