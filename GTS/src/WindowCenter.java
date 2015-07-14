import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class WindowCenter {
	public static void Center(JDialog d){ 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
		Dimension frameSize = d.getSize(); 
		if (frameSize.height > screenSize.height) { 
		frameSize.height = screenSize.height; 
		} 
		if (frameSize.width > screenSize.width) { 
		frameSize.width = screenSize.width; 
		} 
		d.setLocation((screenSize.width - frameSize.width) / 2, 
		(screenSize.height - frameSize.height) / 2); 
		d.show(); 
		} 
}
