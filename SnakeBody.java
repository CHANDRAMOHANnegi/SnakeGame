package snakegamemultiplayer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class SnakeBody  implements SnakeGameConstants{
 
  int speedx;
  int speedy;

  int x;
  int y; 
  
			 public  SnakeBody(int x ,int y){ 
				 this.x=x;
				 this.y=y;
				  	 
			 }   

				
		 public void move (int speedx,int speedy){
			 //System.out.println("mmmmmmmmmmmmmmmm");
			 x=x+speedx;
		 	 y=y+speedy;
			 
		 }  

			public void drawsnakebody(Graphics g){
				  
				 g.setColor(Color.blue);
				// g.fillRoundRect(,);
				 g.fillRect(x+1,y+2,SNAKEBODYWIDTH-3,SNAKEBODYHEIGHT-3);
				 
			}
			  
			
			public int getSpeedX() {
				return speedx;
			}
		
			public void setSpeedX(int speed) {
				this.speedx = speed;
			}
		 
			 

			
			public int getSpeedY() {
				return speedy;
			}
		
			public void setSpeedY(int speed) {
				this.speedy = speed;
			}
		 
			 
			  
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	 
	
	}
