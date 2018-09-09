package commonUtils;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColorC {
	
	public	HashMap<String,Color> hm;
	public   Object[] keys;
	
	public static ColorC col =new ColorC();


	public Color cpuheadColor;
	public Color cpubodyColor;
	public Color yoursnakeheadColor;
	public Color yoursnakebodyColor;
	
	
	
	

	public ColorC(){ 
		  
			hm = new HashMap<String,Color>(); 
			
			  hm.put("red",Color.RED);  
			  hm.put("black",Color.black);  
			  hm.put("yellow",Color.yellow);  
			  hm.put("white",Color.white);  
			  hm.put("cyan",Color.cyan);  
			 
			  hm.put("blue",Color.blue); 
			  hm.put("grey",Color.DARK_GRAY); 
			  hm.put("green",Color.green); 
			  hm.put("orange",Color.ORANGE); 
			  hm.put("pink",Color.PINK);  
			  hm.put("magenta",Color.MAGENTA); 
			   
			  
			 keys = hm.keySet().toArray();
			 
		 }  
	
	
	public Color getCpuheadColor() {
		return cpuheadColor;
	}





	public void setCpuheadColor(Color cpuheadColor) {
		this.cpuheadColor = cpuheadColor;
	}





	public Color getCpubodyColor() {
		return cpubodyColor;
	}





	public void setCpubodyColor(Color cpubodyColor) {
		this.cpubodyColor = cpubodyColor;
	}





	public Color getYoursnakeheadColor() {
		return yoursnakeheadColor;
	}





	public void setYoursnakeheadColor(Color yoursnakeheadColor) {
		this.yoursnakeheadColor = yoursnakeheadColor;
	}





	public Color getYoursnakebodyColor() {
		return yoursnakebodyColor;
	}





	public void setYoursnakebodyColor(Color yoursnakebodyColor) {
		this.yoursnakebodyColor = yoursnakebodyColor;
	} 

}
