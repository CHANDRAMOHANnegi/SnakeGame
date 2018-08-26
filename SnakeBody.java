package snakegamemultiplayer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import commonUtils.Snake;

public class SnakeBody extends Snake  implements SnakeGameConstants{
  
  
			 public  SnakeBody(int x ,int y){ 
				 
				super(x,y);
			 }   

				 

			public void drawsnakebody(Graphics g){
				  
				 g.setColor(Color.black);
			 
				 g.fillRect(getX()+1,getY()+2,SNAKEBODYWIDTH-3,SNAKEBODYHEIGHT-3);
				 
			} 
			
			
			
			
	}
