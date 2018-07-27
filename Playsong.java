package snakegamemultiplayer;

import jaco.mp3.player.MP3Player;

public class Playsong { 
	
	
	static MP3Player mp3;
 
	
	public static void playsong(String song) {
		  
		 mp3=new MP3Player(Playsong.class.getResource(song));
         mp3.play();
        
	}

	
	public static void stopsong(String song) {
		  
		mp3.stop();     
		 
       
	}

}
