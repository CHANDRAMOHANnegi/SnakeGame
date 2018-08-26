package snakegamemultiplayer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import commonUtils.Snake;
import cpuSnake.CpuSnake;
 

public class SnakeGameBoard extends JPanel implements SnakeGameConstants ,ActionListener{
	
       
		Timer timer;
		ArrayList<Snake> snakebody;
		ArrayList<Snake> cpusnakebody;
		
		SnakeBody head;
		CpuSnake cpuhead;
		boolean left,right ,up,down, iscollide,collideWithBody;
	 
		int x=500;
		int y=500;
		int speedx;
		int speedy;
		  
		Collisions collision;
		Drawing draw;
		
		
		SnakeGameBoard()
		
		{
			
			collision=new Collisions();
			draw=new Drawing();
			
			cpusnakebody=new ArrayList<>();
			head=new SnakeBody(300,400);
			
			snakebody=new ArrayList<>();
		    cpuhead=new CpuSnake(x,y);
			
			snakebody.add(head);
			cpusnakebody.add(cpuhead);
			gameloop();
		    setuplevel(snakebody,cpusnakebody);
		   
 			setFocusable(true);
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
						  
							if(up&&speedy==0){
					    		speedy=-SIZE;
					    		speedx=0;  
					    	  }
			
					    	if(down&&speedy==0){
					    		speedy=SIZE;
					    		speedx=0;  
					    	  }
					    	 
					    	if(left&&speedx==0){
					    		speedy=0;
					    		speedx=-SIZE;  
					    	  }
			
					    	
					    	if(right&&speedx==0){
					    		System.out.println("right");
					    		speedy=0;
					    		speedx=SIZE;  
					    	  
					    	}
					    	   	 
					    //*********************important logic*********************//	
					    	
					    	if(speedx!=0||speedy!=0 ){
					    		
					    	for(int i=s.size()-1;i>0;i--)
					    	{
					    		
					    		 s.get(i).setX(s.get(i-1).getX());
					    		 
					    		 s.get(i).setY(s.get(i-1).getY());
					    		 
					    	}
					    	
					    	s.get(0).move(speedx,speedy);
					    	
					    	} 
					   //***************************important*****************************//
					    	
					  }    
			    
	 
	//***************paint component****************************//
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		 draw.drawBackground(g); 
		 draw.drawScoreboard(g);
	   
	 move(snakebody);
	//
		//move(cpusnakebody);
		 
		this.iscollide=collision.foodeaten(snakebody); 
		this.iscollide=collision.foodeaten(cpusnakebody); 
        collision.wallCollision(snakebody); 
        collision.wallCollision(cpusnakebody); 
		this.collideWithBody=collision.collisionWithBody(snakebody, timer); 
		drawfoodagain(g,snakebody);
		 drawfoodagain(g,cpusnakebody);
		//g.fillOval(SnakeGameFrameWidth-8,SnakeGameFrameHeight-31, 6, 6);
		if(collideWithBody){ gameover(g);}
	     for(int i=snakebody.size();i>0;i--){
	    	 //snakebody.get(index)
	       draw.drawSnakebody(snakebody,g);//drawSnakebody(g);
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
				
						this.addKeyListener(new KeyListener() {
							
							@Override
							public void keyTyped(KeyEvent e) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void keyReleased(KeyEvent e) {
								// TODO Auto-generated method stub
					
								int keycode=e.getKeyCode();
								
								if(keycode==KeyEvent.VK_LEFT) left=false;
								if(keycode==KeyEvent.VK_RIGHT) right=false;
								if(keycode==KeyEvent.VK_UP) up=false;
								if(keycode==KeyEvent.VK_DOWN) down=false;
						  
							}
							
							@Override
							public void keyPressed(KeyEvent e) {
								// TODO Auto-generated method stub
							int keycode=e.getKeyCode();
							   if(keycode==KeyEvent.VK_LEFT) left=true;
								if(keycode==KeyEvent.VK_RIGHT) right=true;
								if(keycode==KeyEvent.VK_UP) up=true;
								if(keycode==KeyEvent.VK_DOWN) down=true;
							 		
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
			  
			 
			 public void movecpusnake(ArrayList<CpuSnake> c){
				   
				 
				 
			 }
			 
				/**
				 * @param g
				 * this all code is replaced by Collision class  && Drawing class
				 * 
				 */ 
			 
				 /**
				  * 
				  * draw  background
				  * @param g
				  *    
				  */
					
		/*  private void drawBackground(Graphics g)
		
		 { 
					Image bg = new ImageIcon(SnakeGameBoard.class.getResource(BACKGROUND_IMAGE1)).getImage();
				 
					 g.drawImage(bg,BOARDX,BOARDY,BOARDWIDTH,BOARDHEIGHT,null);
					  
				     g.drawRect(BOARDX, BOARDY, BOARDWIDTH, BOARDHEIGHT);
				     
		 }
		 */
		  
		 
		/**
		 * @param g
		 * draw Snakeboard
		 * 
		 */
		  /*
			
			public void  drawSnakebody(Graphics g){
				
				
						g.setColor(Color.blue);
						for(int i=1;i<snakebody.size();i++){
							
						g.fillRect(
								
						snakebody.get(i).getX(), snakebody.get(i).getY(),
						snakebody.get(i).SNAKEBODYWIDTH-2,snakebody.get(i).SNAKEBODYHEIGHT -2);
							
							 
							}
						g.setColor(Color.red);
						g.fillOval(head.x, head.y, SNAKEBODYWIDTH-2, SNAKEBODYHEIGHT-2);
						} 
			*/
			
			
						
		 
		   /*
		        public void foodeaten(){
			 
		          boolean i=(Math.abs(head.getX()-SnakeFood.x)<=SnakeFood.foodwidth&&
		    		        (Math.abs(head.getY()-SnakeFood.y)<=SnakeFood.foodheight));
		    
		               if(i){ Playsong.playsong(EATSONG); iscollide=true;
		   
		               SnakeFood.randomgenrator();
		      
		               SnakeBody e=new SnakeBody(-111, -111 );
		       		     
		       		   snakebody.add(e);
		       		   
		       		   iscollide=false;
		       		
		          } 
		      
		     }
		 
		 
			 
			 public void wallCollision(){
				 
				 if(head.getX()<=BOARDX){head.setX(BOARDWIDTH+BOARDX-16);}
				  
				 if(head.getX()>=BOARDWIDTH+BOARDX){head.setX(260);}
				 
				 //////////31 by 8
				 
				 if(head.getY()<=BOARDY-5){head.setY(BOARDHEIGHT+BOARDY-15); }
				 
				 if(head.getY()>=BOARDHEIGHT+BOARDY){head.setY(BOARDY);}
				  
			 }
			 
			 
			 
		 public void collisionWithBody(){
			 
			 for(int i=1;i<snakebody.size()-1;i++){
			 
			if(head.getX()==snakebody.get(i+1).getX()&&head.getY()==snakebody.get(i+1).getY()){
				
				collideWithBody=true;
				System.out.println("gameOver");
				timer.stop(); 
				
		           	} 
			 }
			 
		 }
		 
 */
 
 
 
}

