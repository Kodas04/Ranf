package Frames;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
	public Canvas canvas;
	public Graphics g;
	
	public Graphics createGraphics()
	{
		canvas = new Canvas();
		this.add(canvas);
		canvas.createBufferStrategy(3);
		BufferStrategy bf = canvas.getBufferStrategy();
		g = bf.getDrawGraphics();
		return bf.getDrawGraphics();
	}
	
	public Graphics getGraphics()
	{
		return g;
	}
	
	

}
