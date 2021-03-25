package java_Thread;

public class RunnableEx implements Runnable{
	//�ش� Ŭ������ �̹� ��� �ް� ������ �������̽��� ������ ����
	String word;
	RunnableEx(String word){
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
		//Runnable�� ��������� �ڵ常 ������ Ŭ�����̱� ������ ������� ȣ���Ͽ� ����ؾ���
		//RunnableEx obj1 = new RunnableEx("������1");
		//RunnableEx obj2 = new RunnableEx("������2");		
		//Thread t1 = new Thread(obj1);
		//Thread t2 = new Thread(obj2);
		Thread t1 = new Thread(new RunnableEx("������1"));
		Thread t2 = new Thread(new RunnableEx("������2"));
		
		t1.start();	//t1, t2 �����ư��鼭 ����
		t2.start();
//		t1.run();	//t1���� �Ϸ� �� t2 ����
//		t2.run();
	}

}
