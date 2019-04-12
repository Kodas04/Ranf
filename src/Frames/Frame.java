package Frames;

import javax.swing.JFrame;

public class Frame {
	

	public void Frame(String title, int width, int height, boolean visible) {
		
		JFrame frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setVisible(visible);
		
		
	}

}
