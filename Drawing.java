package snakegamemultiplayer;

import java.awt.Color;
import java.awt.Font;
//import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import commonUtils.Snake;

public class Drawing implements SnakeGameConstants {

	
	Snake head;

    public void drawBackground(Graphics g)

    { 
			Image bg = new ImageIcon(SnakeGameBoard.class.getResource(BACKGROUND_IMAGE1)).getImage();
		 
			 g.drawImage(bg,BOARDX,BOARDY,BOARDWIDTH,BOARDHEIGHT,null); 
			  
		     g.drawRect(BOARDX, BOARDY, BOARDWIDTH, BOARDHEIGHT);
		      		     
    } 
	

	public void  drawSnakebody(ArrayList<Snake> s,Graphics g){
		
		     head=s.get(0); 
				Class c=s.get(0).getClass();
				for(int i=1;i<s.size();i++){
					if(c.getName()=="snakegamemultiplayer.SnakeBody"){
				// System.out.println(c.getName());
					
				g.setColor(Color.blue);
				g.fillRect(s.get(i).getX(),s.get(i).getY(),SNAKEBODYWIDTH-2,SNAKEBODYHEIGHT -2);
					}
					else {
						  
						g.setColor(Color.black);
						g.fillRect(s.get(i).getX(),s.get(i).getY(),SNAKEBODYWIDTH-2,SNAKEBODYHEIGHT -2);
					}
					 
				  }
				if(c.getName()=="snakegamemultiplayer.SnakeBody"){
				g.setColor(Color.red);
				g.fillOval(head.getX(), head.getY(), SNAKEBODYWIDTH-2, SNAKEBODYHEIGHT-2);
				}
				
				else{g.setColor(Color.green);
				g.fillOval(head.getX(), head.getY(), SNAKEBODYWIDTH-2, SNAKEBODYHEIGHT-2);
				}
	   } 
	
	
	
	
	public   void drawScoreboard(Graphics g){
	
		Font font = new Font(Font.SERIF, Font.BOLD, 30);
		g.setFont(font);
		g.drawString("Score", 30,40);
		g.setColor(Color.magenta);
		g.drawString(Integer.toString(Collisions.countFood), 50, 80);
	 	
		g.setColor(Color.black);
		//g.drawRect(10, 10, 100, 70);
		
		 
	    g.draw3DRect(15, 50, 80, 50, true);
		
	}
	 
	
	
}









