package snakegamemultiplayer;

import java.util.ArrayList;

import javax.swing.Timer;

import commonUtils.Playsong;
import commonUtils.Snake;
import cpuSnake.CpuControls;
  
public class Collisions implements SnakeGameConstants {

	 public static int cpuscore=0;
	 public static int yourscore=0;
	 Snake head;
	
	
	
	 public   boolean foodeaten(ArrayList<Snake> s){
		 
				 head=s.get(0);
				 
				 boolean iscollide = false;
				 Class c=s.get(0).getClass();
			     boolean i=(Math.abs(head.getX()-SnakeFood.x)<=SnakeFood.foodwidth-1&&
			    		   (Math.abs(head.getY()-SnakeFood.y)<=SnakeFood.foodheight-2));
			          
			             if(i){
			            	 
			            	   Playsong.playsong(EATSONG); 
			            	   
				               SnakeFood.randomgenrator();
				               
				      
				               Snake e=new SnakeBody(-111, -111 );
				       		     
				       		   s.add(e); 
				       		   
								if(c.getName()=="snakegamemultiplayer.SnakeBody"){yourscore++;setYourscore(yourscore);	}
								else {cpuscore++;setCpuscore(cpuscore);}
				       		   iscollide=false;
				       					       		 
			                   } 

			 			CpuControls.textField.setText(Integer.toString(Collisions.getYourscore()));
			 			CpuControls.textField_3.setText(Integer.toString(Collisions.getCpuscore()));
			      return iscollide;
			      
			     }

	 
	 public static int getCpuscore() {
		return cpuscore;
	}


	public static void setCpuscore(int cpuscore) {
		Collisions.cpuscore = cpuscore;
	}


	public static int getYourscore() {
		return yourscore;
	}


	public static void setYourscore(int yourscore) {
		Collisions.yourscore = yourscore;
	}


	public void wallCollision(ArrayList<Snake> s){
		  	
 			head=s.get(0);
		  
				 if(head.getX()<=BOARDX-1){head.setX(BOARDWIDTH+BOARDX-20);}
				  
				 if(head.getX()>=BOARDWIDTH+BOARDX){head.setX(260);}
				 
				 //////////31 by 8
				 
				 if(head.getY()<=BOARDY-1){head.setY(BOARDHEIGHT+BOARDY-20); }
				 
				 if(head.getY()>=BOARDHEIGHT+BOARDY-1){head.setY(BOARDY+1);}
				  
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
