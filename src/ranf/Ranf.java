package ranf;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import Frames.Frame;

public class Ranf implements Runnable {
	
	public ArrayList<Player> players = new ArrayList<Player>();
	
	static GT gt = new GT();
	
	public Thread thread;
	public boolean running;
	
	public double framerate = 1.0/60.0;
	
	public Ranf() {
		
	}
	
	public void start()
	{
		thread = new Thread(this);
		running = true;
		
		gt.setFrame(new Frame("Frame", gt.getScreenWidth() ,gt.getScreenHeight() , true));
		
		thread.run();
	}
	
	public void stop()
	{
		running = false;
	}
	
	public void exit()
	{
		gt.getFrame().dispatchEvent(new WindowEvent(gt.getFrame(), WindowEvent.WINDOW_CLOSING));
	}
	
	public void run()
	{
		boolean render = false;
		double firstTime = 0;
		double lastTime = System.nanoTime() / 1000000000.0;
		double passedTime = 0;
		double unprocessedTime = 0;
		double frameTime = 0;
		int frames = 0;
		int fps = 0;
		
		while(running) {
			render = false;
			firstTime = System.nanoTime() / 1000000000.0;
			passedTime = firstTime - lastTime;
			lastTime = firstTime;		
			unprocessedTime += passedTime;
			frameTime += passedTime;
			
			while(unprocessedTime >= framerate) {
				unprocessedTime -= framerate;
				render = true;
				
				/*Update function*/
				
				System.out.println(fps);
				
				for(Player p : players)
				{
					p.update(framerate);
				}
				
				if(frameTime >= 1.0) {
					frameTime = 0;
					fps = frames;
					frames = 0;
				}
			}
			
			if(render) {
				//TODO : Render
				for(Player p : players)
				{
					p.render(gt.getFrame().view.getGraphics());
				}
				frames++;
			} else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
