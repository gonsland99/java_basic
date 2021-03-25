package java_Thread;

public class ThreadEx extends Thread{
	String word;
	ThreadEx(String word){
		this.word = word;
	}
	
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(500);	//0.5�� �������� ����
				System.out.println(word+": "+i);
			}
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx("������1");
		ThreadEx t2 = new ThreadEx("������2");
//		t1.start();	//t1, t2 �����ư��鼭 ����
//		t2.start();
		t1.run();	//t1���� �Ϸ� �� t2 ����
		t2.run();
	}

}
