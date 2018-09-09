package snakegamemultiplayer;
 
import java.awt.Color;
import demo.sphinx.helloworld.HelloWorld;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
import commonUtils.Snake;
import cpuSnake.CpuSnake;
 

public class SnakeGameBoard extends JPanel implements SnakeGameConstants ,ActionListener{
	
		public Runnable r;
		public 	Timer timer;
		private	Drawing draw;
		private SnakeBody head;
		public  CpuSnake cpuhead;
		private Collisions collision;
		private ArrayList<Snake> snakebody;
		private ArrayList<Snake> cpusnakebody;
		public static SnakeGameBoard sb= new SnakeGameBoard();	 
		
		String dir;
		String  left,right ,up,down;	
		boolean iscollide,collideWithBody;
	 
		int x=0;
		int y=0;
		int speedx;
		int speedy;
		   
		
		public SnakeGameBoard()
		
		{
			
			setLayout(null);
		   
			collision=new Collisions();
			draw=new Drawing();
			
			cpusnakebody=new ArrayList<>();
			head=new SnakeBody(300,400);
			snakebody=new ArrayList<>();
		    cpuhead=new CpuSnake(600,600);
			snakebody.add(head);
			cpusnakebody.add(cpuhead);
			
			
		    setuplevel(snakebody,cpusnakebody);
 			setFocusable(true);
 			gameloop();
 			
			 controller();
			
			 
		 
		} 
		

		void gameloop(){
			
			timer=new Timer(DELAY,this);
			
			timer.start();
			  
		}
		

		@Override
		public void actionPerformed(ActionEvent e) {
			 
			repaint();
	 
		}
		
		 
		
			/**
			 * ///this code is for creation of snake body initially
			 * 
			 */
		
			public void setuplevel(ArrayList<Snake> snake,ArrayList<Snake> cpu){
				
					for(int i=1;i<3;i++){
						snake.add( new SnakeBody(head.getX()+i*20,head.getY()));
						cpu.add( new CpuSnake(cpuhead.getX()+i*20,cpuhead.getY()));
						
 				/*****************	cpusnake created ************************************/
						 
					} 
				
				}  
			
			
			
	
	  public void move(ArrayList<Snake> s){
						  

			if(getDir()=="up"&&speedy==0){
				head.speedy=-SIZE;
				head.speedx=0; 
				
	    	  }

	    	if(getDir()=="down"&&speedy==0){
	    		head.speedy=SIZE;
	    		head.speedx=0; 
	    		
	    	  }
	    	 
	    	if(getDir()=="left"&&speedx==0){
	    		head.speedy=0;
	    		head.speedx=-SIZE;  
	    		
	    	  }
	    	
	    	if(getDir()=="right"&&speedx==0){
	    		//System.out.println("right");
	    		head.speedy=0;
	    		head.speedx=SIZE;  
	    	  
	    	}
	    	   	 
					    //*********************important logic*********************//	
					    	
					    	if(head.speedx!=0||head. speedy!=0 ){
					    		
					    	for(int i=s.size()-1;i>0;i--)
					    	{
					    		
					    		 s.get(i).setX(s.get(i-1).getX());
					    		 
					    		 s.get(i).setY(s.get(i-1).getY());
					    		 
					    	}
					    	
					    	head.move(head.speedx,head.speedy);
					    	
					    	} 
					   //***************************important*****************************//
					    	
					  
	  	}   
	  
			    
	  public void movecpuSnake(){
		   
		  
			  if(Math.abs(cpuhead.getX()-SnakeFood.x)>=SnakeFood.foodwidth){
				  
				  if(cpuhead.getX()>SnakeFood.x){cpuhead.setX(cpuhead.getX()-SIZE);}
				  
				  else{cpuhead.setX(cpuhead.getX()+SIZE);}
				  
					 
				    	for(int i=cpusnakebody.size()-1;i>0;i--)
				    	{
				    		
				    		cpusnakebody.get(i).setX(cpusnakebody.get(i-1).getX());
				    		 
				    		 cpusnakebody.get(i).setY(cpusnakebody.get(i-1).getY());
				    		 
				    	}
				    	
				    	cpusnakebody.get(0).move(speedx,speedy);
				    	
				    	 
				    
			  }  
			  

			  else   if(Math.abs(cpuhead.getY()-SnakeFood.y)>=SnakeFood.foodheight){
				  
				  if(cpuhead.getY()>SnakeFood.y){cpuhead.setY(cpuhead.getY()-SIZE);}
				  
				  else{cpuhead.setY(cpuhead.getY()+SIZE);}
				  
				  for(int i=cpusnakebody.size()-1;i>0;i--)
			    	{
			    		
			    		cpusnakebody.get(i).setX(cpusnakebody.get(i-1).getX());
			    		 
			    		 cpusnakebody.get(i).setY(cpusnakebody.get(i-1).getY());
			    		 
			    	}
			    	
			    	cpuhead.move(speedx,speedy);
				    
			  }   
	  } 
	  
	  
	  
	//***************paint component****************************//
	  
	public void paintComponent(Graphics g){
		
				super.paintComponent(g);
				draw.drawBackground(g);  
//				if(getDir()!=null){
//				 voiceControllerMove(getDir());
//				}
				move(snakebody); 
				movecpuSnake();
			 
			    this.iscollide=collision.foodeaten(snakebody); 
				this.iscollide=collision.foodeaten(cpusnakebody); 
			    collision.wallCollision(snakebody); 
			    collision.wallCollision(cpusnakebody); 
				this.collideWithBody=collision.collisionWithBody(snakebody, timer); 
				drawfoodagain(g,snakebody);
			    drawfoodagain(g,cpusnakebody);
		 
				if(collideWithBody){ gameover(g);}
					     for(int i=snakebody.size();i>0;i--){
					 
					       draw.drawSnakebody(snakebody,g);
					       draw.drawSnakebody(cpusnakebody,g);
					     }
	
		} 
	
	
	
		public void drawfoodagain(Graphics g,ArrayList<Snake> s){
			
			 
				for(int i=1;i<s.size();i++){
					
						if((Math.abs(s.get(i).getX()-SnakeFood.x)<SnakeFood.foodwidth)&&
								(Math.abs(s.get(i).getY()-SnakeFood.y)<SnakeFood.foodheight)){
								 SnakeFood.randomgenrator();break;
							}
						
						else{
								SnakeFood.drawfood(g);
				}}  
			
		}
		
	
	
			 public void	controller(){
				
					this.addKeyListener(new KeyAdapter() {
					 
							
							@Override
							public void keyPressed(KeyEvent e) {
								// TODO Auto-generated method stub
							int keycode=e.getKeyCode();
							
							
							    if(keycode==KeyEvent.VK_LEFT&&dir!="right")dir="left";
								if(keycode==KeyEvent.VK_RIGHT&&dir!="left")dir="right";
								if(keycode==KeyEvent.VK_UP&&dir!="down")dir="up";
								if(keycode==KeyEvent.VK_DOWN&&dir!="up")dir="down";
								if(keycode==KeyEvent.VK_SPACE){
									
									if(timer.isRunning()){timer.stop();}
									else{timer.start();}
									
								}
							 		
							 }
						});
			} 
			 
			 
			 
			 public void gameover(Graphics g){
				 
				 Font font = new Font(Font.SERIF, Font.BOLD, 40);
						 g.setColor(Color.GREEN);
						 g.setFont(font);
						 		
						 g.drawString("GAME OVER", SnakeGameFrameWidth/2-100, SnakeGameFrameHeight/2);
						   
						 System.out.println();
						    
			 
			 }

			
			
			public void	voiceControllerMove(String direction)
			{
				direction=getDir();
				System.out.println("voice controlllerr  ");
				if(direction.trim()=="left"&&dir!="right")
				{ 	head.speedy=0;
	    			head.speedx=-SIZE;  
	    			
	    			System.out.println("leffffft");
				}
				if(direction.trim()=="right"&&dir!="left")
				{	head.speedy=0;
		    		head.speedx=SIZE; 
		    		System.out.println("right tttt");
		    	}
				if(direction.trim()=="up"&&dir!="down")
				{	head.speedy=-SIZE;
					head.speedx=0;
					System.out.println("upppppp");
				}
				if(direction.trim()=="down"&&dir!="up")
				{	head.speedy=SIZE;
	    			head.speedx=0;
	    			System.out.println("downnnnnnn");
	    		}
				if(head.speedx!=0||head. speedy!=0 ){
		    		
			    	for(int i=snakebody.size()-1;i>0;i--)
			    	{
			    		
			    		snakebody.get(i).setX(snakebody.get(i-1).getX());
			    		 
			    		snakebody.get(i).setY(snakebody.get(i-1).getY());
			    		 
			    	}
			    	
			    	head.move(head.speedx,head.speedy);
			    	
			    	} 
			}
					  
			 
			 
			 public String getDir() {
				return dir;
			}


			public void setDir(String dir) {
				this.dir = dir;
			}

		   
 
}

 