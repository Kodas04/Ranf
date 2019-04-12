package Frames;

import javax.swing.JFrame;

import gfx.View;

public class Frame extends JFrame{

	public View view;
	String title;
	int width, height;
	boolean visible;
	
	
	public Frame(String title, int width, int height, boolean visible) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		this.visible = visible;
		
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
