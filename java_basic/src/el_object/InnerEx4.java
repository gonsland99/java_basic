package el_object;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx4 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		//익명클래스를 이용한 단순화
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 발생");
			}
		});
	}
}
		/*
		b.addActionListener(new Event());
	}
}
class Event implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("액션 발생");
	}
}
*/