package Frames;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame {
	
	JFrame frame;
	
	String title;
	
	int width, height;
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	int screen_width =
	
	public void Frame() {
		
		frame("Frame, ")
		
	}
	
	
	private void frame(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setVisible(true);
		
		
		
	}

}
