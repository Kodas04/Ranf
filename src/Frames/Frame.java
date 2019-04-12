package Frames;

import javax.swing.JFrame;

import gfx.View;

public class Frame extends JFrame{

	public View view;
	
	public void Frame(String title, int width, int height, boolean visible) {
		
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}

	public View getView()
	{
		return view;
	}

	public void setView(View view)
	{
		this.view = view;
	}
	
	

}
