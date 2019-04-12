package Frames;

import javax.swing.JFrame;

public class Frame extends JFrame{

	public void Frame(String title, int width, int height, boolean visible) {
		
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
		
		
	}

}
