package java_applet;

import javax.swing.JApplet;

import java.awt.*;

public class AppletLifeCycle extends JApplet {
	Font serifBold;
	String param;
	public void init() {
		System.out.println("init: �ʱ�ȭ");
		setBackground(Color.cyan);	//��漳��
		serifBold = new Font("Serif",Font.BOLD, 10);	//��Ʈ����
	}
	public void start() {
		System.out.println("start: ����");
	}
	public void stop() {
		System.out.println("stop: ����");
	}
	public void destroy() {
		System.out.println("destroy: �Ҹ�");
	}
	public void paint(Graphics g) {
		System.out.println("paint: ���");
		Color myColor = new Color(0, 0, 0);	//��� �ʱ�ȭ
		g.setColor(myColor);
		g.setFont(serifBold);
		param = "SerifBoldü, ������:10";
		g.drawString(param, 10, 10);
	}
}
