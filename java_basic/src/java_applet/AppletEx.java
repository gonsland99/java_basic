package java_applet;

import javax.swing.JApplet;
import java.awt.Graphics;

public class AppletEx extends JApplet {
	String title;
	public void init() {
		title = getParameter("param1");
		if(title == null)
			title = "값이 없음";
	}
	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}
}
