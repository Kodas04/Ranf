package utils;

public class Vec2
{//Class to hold 2 variables for Transform or Velocity
	public int x, y;
	
	public Vec2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void sub(Vec2 v)
	{
		x -= v.x;
		y -= v.y;
	}
	
	public void add(Vec2 v)
	{
		x += v.x;
		y += v.y;
	}
	
	public void mul(Vec2 v)
	{
		x *= v.x;
		y *= v.y;
	}
}
