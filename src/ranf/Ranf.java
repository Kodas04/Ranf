package ranf;

import Frames.Frame;

public class Ranf {
	
	
	static GT gt = new GT();
	
	
	public Ranf() {
		
		new Frame("Frame", gt.getScreenWidth() ,gt.getScreenHeight() , true);
		
	}
	
	
	
}
