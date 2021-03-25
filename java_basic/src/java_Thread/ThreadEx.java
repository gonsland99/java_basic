package java_Thread;

public class ThreadEx extends Thread{
	String word;
	ThreadEx(String word){
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
		ThreadEx t1 = new ThreadEx("쓰레드1");
		ThreadEx t2 = new ThreadEx("쓰레드2");
//		t1.start();	//t1, t2 번갈아가면서 수행
//		t2.start();
		t1.run();	//t1수행 완료 후 t2 수행
		t2.run();
	}

}
