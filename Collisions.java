package snakegamemultiplayer;

import java.util.ArrayList;

import javax.swing.Timer;

import commonUtils.Playsong;
import commonUtils.Snake;

 

public class Collisions implements SnakeGameConstants {

	 static int countFood=0;
	 
	Snake head;
	
	
	
	 public   boolean foodeaten(ArrayList<Snake> s){
		 
				 head=s.get(0);
				 
				 boolean iscollide=false;
				 
			     boolean i=(Math.abs(head.getX()-SnakeFood.x)<=SnakeFood.foodwidth&&
			    		   (Math.abs(head.getY()-SnakeFood.y)<=SnakeFood.foodheight));
			          
			             if(i){
			            	 
			            	   Playsong.playsong(EATSONG); 
			            	   iscollide=true;
			            	   countFood++;
				               SnakeFood.randomgenrator();
				      
				               SnakeBody e=new SnakeBody(-111, -111 );
				       		     
				       		   s.add(e);
				       		   iscollide=false;
			       		 
			                   } 
			               
			      return iscollide;
			      
			     }
	 
	 
	 
	 public void wallCollision(ArrayList<Snake> s){
		  	
		 			head=s.get(0);
		  
				 if(head.getX()<=BOARDX){head.setX(BOARDWIDTH+BOARDX-16);}
				  
				 if(head.getX()>=BOARDWIDTH+BOARDX){head.setX(260);}
				 
				 //////////31 by 8
				 
				 if(head.getY()<=BOARDY-5){head.setY(BOARDHEIGHT+BOARDY-15); }
				 
				 if(head.getY()>=BOARDHEIGHT+BOARDY){head.setY(BOARDY);}
				  
	        }
	 
	 
	 
	public boolean collisionWithBody(ArrayList<Snake> s,Timer timer){
		 head=s.get(0);
				 boolean collideWithBody=false;
				 
				 for(int i=1;i<s.size()-1;i++){
				 
				if(head.getX()==s.get(i+1).getX()&&head.getY()==s.get(i+1).getY()){
					
					collideWithBody=true;
					System.out.println("gameOver");
					timer.stop(); 
					
			           	} 
				 }return collideWithBody;
				 
			 }
			 
	 
	 
	 

}
