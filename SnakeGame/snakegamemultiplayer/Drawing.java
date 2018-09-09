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

import commonUtils.ColorC;
import commonUtils.Snake;
import cpuSnake.CpuControls;

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
					/**
					 * body color
					 */
					
					if(c.getName()=="snakegamemultiplayer.SnakeBody"){
				 
						if(ColorC.col.getYoursnakebodyColor()!=null){
							g.setColor(ColorC.col.getYoursnakebodyColor());
						}
						else{g.setColor(Color.blue);
}
							g.fillOval(s.get(i).getX(),s.get(i).getY(),SNAKEBODYWIDTH,SNAKEBODYHEIGHT);
							 
						}
					else {
						  if(ColorC.col.getCpubodyColor()!=null){
							g.setColor(ColorC.col.getCpubodyColor());}
						  
						  else{g.setColor(Color.RED);}
						    g.fillOval(s.get(i).getX(),s.get(i).getY(),SNAKEBODYWIDTH,SNAKEBODYHEIGHT);
						}
					 
					}
					/**
					 * head color
					 */
				
					if(c.getName()=="snakegamemultiplayer.SnakeBody"){
						
						 if(ColorC.col.getYoursnakeheadColor()!=null){
								g.setColor(ColorC.col.getYoursnakeheadColor());}
							  
							  else{g.setColor(Color.black);}
							g.setColor(ColorC.col.getYoursnakeheadColor());
							g.fillOval(head.getX(), head.getY(), SNAKEBODYWIDTH, SNAKEBODYHEIGHT);
						}
				
					else{ if(ColorC.col.getCpuheadColor()!=null){
						g.setColor(ColorC.col.getCpuheadColor());}
					  
					  else{g.setColor(Color.magenta);}
						  
							g.fillOval(head.getX(), head.getY(), SNAKEBODYWIDTH, SNAKEBODYHEIGHT);
						}
	   } 
	 
	
	 
	
}
 