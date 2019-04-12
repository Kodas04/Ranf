package ranf;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GT {

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	int screen_width = dim.width;
	int screen_height = dim.height;
	
	
	public void setScreenWidth(int screen_width) {
		this.screen_width = screen_width;
		
	}
	
	
	public int getScreenWidth() {
		return screen_width;
		
	}
	
	public void setScreenHeight(int screen_height) {
		this.screen_height = screen_height;
		
	}
	
	
	public int getScreenHeight() {
		return screen_height;
		
	}
	
	
	
	
}
