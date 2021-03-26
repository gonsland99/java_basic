package java_applet;

import javax.swing.JApplet;

import java.awt.*;

public class AppletLifeCycle extends JApplet {
	Font serifBold;
	String param;
	public void init() {
		System.out.println("init: 초기화");
		setBackground(Color.cyan);	//배경설정
		serifBold = new Font("Serif",Font.BOLD, 10);	//폰트설정
	}
	public void start() {
		System.out.println("start: 시작");
	}
	public void stop() {
		System.out.println("stop: 정지");
	}
	public void destroy() {
		System.out.println("destroy: 소멸");
	}
	public void paint(Graphics g) {
		System.out.println("paint: 출력");
		Color myColor = new Color(0, 0, 0);	//배경 초기화
		g.setColor(myColor);
		g.setFont(serifBold);
		param = "SerifBold체, 사이즈:10";
		g.drawString(param, 10, 10);
	}
}
