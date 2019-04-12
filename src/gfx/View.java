package gfx;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class View
{

	public JFrame frame;
	public Canvas canvas;
	public Graphics g;
	
	public View(JFrame frame)
	{
		this.frame = frame;
	}
	
	public Graphics createGraphics()
	{
		canvas = new Canvas();
		frame.add(canvas);
		canvas.createBufferStrategy(3);
		BufferStrategy bf = canvas.getBufferStrategy();
		return bf.getDrawGraphics();
	}
	
	public Graphics getGraphics()
	{
		return g;
	}
	
}
