package cpuSnake;

import snakegamemultiplayer.SnakeGameConstants;
import java.awt.Color;
import java.awt.Graphics; 

import commonUtils.Snake; 



  public class CpuSnake extends Snake implements SnakeGameConstants{
  
	  public CpuSnake() {
		 
	} 

	  public CpuSnake(int x ,int y) {
		 super(x,y);
	} 
	  
	  
	public void drawsnakebody(Graphics g){
			  
			 g.setColor(Color.black);
			// g.fillRoundRect(,);
			 g.fillOval(getX()+1,getY()+2,SNAKEBODYWIDTH-3,SNAKEBODYHEIGHT-3);
			 
		} 
	
  }
