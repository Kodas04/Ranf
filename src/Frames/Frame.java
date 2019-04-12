package Frames;

import javax.swing.JFrame;

public class Frame {
	
	JFrame frame;
	
	String title;
	
	int width, height;
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	int screen_width =
	
	public void Frame() {
		
		frame("Frame, ");

	public void Frame(String title, int width, int height, boolean visible) {
		
		JFrame frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setVisible(visible);
		
		
	}

}
