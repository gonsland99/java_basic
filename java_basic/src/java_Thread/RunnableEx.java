package java_Thread;

public class RunnableEx implements Runnable{
	//해당 클래스가 이미 상속 받고 있으면 인터페이스로 스레드 구현
	String word;
	RunnableEx(String word){
		this.word = word;
	}
	
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(500);	//0.5초 간격으로 실행
				System.out.println(word+": "+i);
			}
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		//Runnable은 스레드실행 코드만 포함한 클래스이기 때문에 쓰레드로 호출하여 사용해야함
		//RunnableEx obj1 = new RunnableEx("쓰레드1");
		//RunnableEx obj2 = new RunnableEx("쓰레드2");		
		//Thread t1 = new Thread(obj1);
		//Thread t2 = new Thread(obj2);
		Thread t1 = new Thread(new RunnableEx("쓰레드1"));
		Thread t2 = new Thread(new RunnableEx("쓰레드2"));
		
		t1.start();	//t1, t2 번갈아가면서 수행
		t2.start();
//		t1.run();	//t1수행 완료 후 t2 수행
//		t2.run();
	}

}
