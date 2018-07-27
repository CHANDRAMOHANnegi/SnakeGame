package snakegamemultiplayer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class SnakeFood implements SnakeGameConstants{
   
	static BufferedImage img;
	
	static int x=300;
	static int y=500;
	static int foodwidth=20;
	static int foodheight=20;
	static Random randomNum;
	  
	
			static {
				
				loadfood(); 
				randomNum=new Random();
				
				
		   	}
			
			/**
			 * (Math.random()*(maximum - minimum))) +minimum
			 *
			 * r.nextInt((max - min) + 1) + min;
			 *
			 */ 
			
			
			  public static void randomgenrator(){
				x=randomNum.nextInt(((BOARDWIDTH+BOARDX-15)-BOARDX))+BOARDX;
		 		y=randomNum.nextInt(((BOARDHEIGHT+BOARDY-10)-BOARDY))+BOARDY;		 		  
			   }
			
	
			  
	public static void loadfood(){
		
			try {
				img = ImageIO.read(SnakeFood.class.getResource(food));
			} catch (IOException e) {
				 
				e.printStackTrace();
			}
 
	}
	

	public static void drawfood(Graphics g)
	
	  {  
 		g.drawImage(img, x, y, foodwidth, foodheight, null);
 	 	  
	  }
		  
	
}
