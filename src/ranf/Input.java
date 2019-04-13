package ranf;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input extends GT implements KeyListener {
	
	
	GT gt;
	int x = gt.x;
	int y = gt.y;
	

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_W) y--;
		if (e.getKeyCode() == KeyEvent.VK_A) x--;
		if (e.getKeyCode() == KeyEvent.VK_S) y++;
		if (e.getKeyCode() == KeyEvent.VK_D) x++;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) y = y;
		if (e.getKeyCode() == KeyEvent.VK_A) y = y;
		if (e.getKeyCode() == KeyEvent.VK_S) x = x;
		if (e.getKeyCode() == KeyEvent.VK_D) x = x;
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	


}
