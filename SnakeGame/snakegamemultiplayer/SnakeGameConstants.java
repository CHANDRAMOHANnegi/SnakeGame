package snakegamemultiplayer;

public interface SnakeGameConstants {
	 
	int SnakeGameFrameWidth=1200;
	int SnakeGameFrameHeight=800;
	int SNAKEBODYWIDTH=20;
	int SNAKEBODYHEIGHT=20;
	int BOARDWIDTH=680;
	int BOARDHEIGHT=680;
	int BOARDX=260;
	
	int BOARDY=20;
	 
	int DELAY = 110;
	int SIZE=20;
	
	String BACKGROUND_IMAGE1="chess.jpg";
	String food="food.png";
	  
	String SPLASHSONG="snake_music.mp3";
	String EATSONG="eat.mp3";
	  
}


//	 if(head.getX()<=BOARDX){head.setX(BOARDWIDTH+BOARDX-16);}