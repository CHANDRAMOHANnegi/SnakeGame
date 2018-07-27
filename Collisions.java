package snakegamemultiplayer;

import java.util.ArrayList;

import javax.swing.Timer;

 

public class Collisions implements SnakeGameConstants {

	 
	SnakeBody head;
	
	
	
	 public   boolean foodeaten(ArrayList<SnakeBody> snakebody){
		 
				 head=snakebody.get(0);
				 
				 boolean iscollide=false;
				 
			     boolean i=(Math.abs(head.getX()-SnakeFood.x)<=SnakeFood.foodwidth&&
			    		   (Math.abs(head.getY()-SnakeFood.y)<=SnakeFood.foodheight));
			          
			               if(i){ Playsong.playsong(EATSONG); iscollide=true;
			   
			               SnakeFood.randomgenrator();
			      
			               SnakeBody e=new SnakeBody(-111, -111 );
			       		     
			       		   snakebody.add(e);
			       		   iscollide=false;
			       		 
			                   } 
			               
			      return iscollide;
			      
			     }
	 
	 
	 
	 public void wallCollision(){
		 
				 if(head.getX()<=BOARDX){head.setX(BOARDWIDTH+BOARDX-16);}
				  
				 if(head.getX()>=BOARDWIDTH+BOARDX){head.setX(260);}
				 
				 //////////31 by 8
				 
				 if(head.getY()<=BOARDY-5){head.setY(BOARDHEIGHT+BOARDY-15); }
				 
				 if(head.getY()>=BOARDHEIGHT+BOARDY){head.setY(BOARDY);}
				  
	        }
	 
	 
	 
	public boolean collisionWithBody(ArrayList<SnakeBody> snakebody,Timer timer){
				 boolean collideWithBody=false;
				 
				 for(int i=1;i<snakebody.size()-1;i++){
				 
				if(head.getX()==snakebody.get(i+1).getX()&&head.getY()==snakebody.get(i+1).getY()){
					
					collideWithBody=true;
					System.out.println("gameOver");
					timer.stop(); 
					
			           	} 
				 }return collideWithBody;
				 
			 }
			 
	 
	 
	 

}
