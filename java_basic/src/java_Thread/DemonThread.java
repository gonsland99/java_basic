package java_Thread;

//���󽺷���: �ٸ������尡 ��� ����Ǹ� �ڽŵ� ����
public class DemonThread extends Thread{
	public void run() {
		try {
			System.out.println("Demon Thread Start!");
			sleep(10000);
			System.out.println("Demon Thread End!");
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		DemonThread dt = new DemonThread();
		dt.setDaemon(true);
		dt.start();
		System.out.println("Main Method End!");
	}
}
