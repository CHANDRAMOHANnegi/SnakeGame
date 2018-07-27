package snakegamemultiplayer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Drawing implements SnakeGameConstants {

	
	SnakeBody head;

    public void drawBackground(Graphics g)

    { 
			Image bg = new ImageIcon(SnakeGameBoard.class.getResource(BACKGROUND_IMAGE1)).getImage();
		 
			 g.drawImage(bg,BOARDX,BOARDY,BOARDWIDTH,BOARDHEIGHT,null);
			  
		     g.drawRect(BOARDX, BOARDY, BOARDWIDTH, BOARDHEIGHT);
		     
    }
    
	
	

	public void  drawSnakebody(ArrayList<SnakeBody> snakebody,Graphics g){
		
		     head=snakebody.get(0);
		
		
				g.setColor(Color.blue);
				for(int i=1;i<snakebody.size();i++){
					
				g.fillRect(
						
				snakebody.get(i).getX(), snakebody.get(i).getY(),
				 SNAKEBODYWIDTH-2, SNAKEBODYHEIGHT -2);
					
					 
					}
				g.setColor(Color.red);
				g.fillOval(head.x, head.y, SNAKEBODYWIDTH-2, SNAKEBODYHEIGHT-2);
				} 
	
	
	 
	
	
}









