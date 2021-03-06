package ranf;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import utils.Vec2;

public class Player extends GT
{

	public Vec2 transform = new Vec2(0, 0);

	public Vec2 vel = new Vec2(0, 0);
	
	public BufferedImage skin;
	
	GT gt;
	
	int x = gt.x;
	int y = gt.y;
	
	public Player(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		transform.x = x;
		transform.y = y;
	}
	
	public void update(double dt)
	{
		transform.add(vel);
	}
	
	public void render(Graphics g)
	{
		g.fillRect(transform.x, transform.y, 16, 16);
		//g.drawImage(skin, transform.x, transform.y, null);
	}
	
	public Rectangle getBox()
	{
		return new Rectangle(transform.x, transform.y, 16, 16);
	}
	
}
