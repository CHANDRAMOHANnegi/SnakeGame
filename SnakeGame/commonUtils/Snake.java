/**
 * 
 */
package commonUtils;

/**
 * @author CM
 *
 */   
import snakegamemultiplayer.SnakeGameConstants;
import java.awt.Graphics;
 



public abstract class Snake implements SnakeGameConstants{

	 
		 public int speedx;
		 public int speedy;
	
		 public int x;
		 public int y;  
		  
		  

		public Snake() {
		 
		}
		  
		  
		  public  Snake(int x ,int y){ 
				 this.x=x;
				 this.y=y;
				  	 
			 }   
 
			
		  public void move (int speedx,int speedy){
	 
				 x=x+speedx;
			 	 y=y+speedy;
				 
			 }  


		abstract  public void drawsnakebody(Graphics g);
				
			
		 public int getSpeedx() {
			return speedx;
		}


		public void setSpeedx(int speedx) {
			this.speedx = speedx;
		}


		public int getSpeedy() {
			return speedy;
		}


		public void setSpeedy(int speedy) {
			this.speedy = speedy;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}



		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}
				  
				 
}
