package java_Thread;

//데몬스레드: 다른스레드가 모두 종료되면 자신도 종료
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
