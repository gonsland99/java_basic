package java_MultipleDataProcesse;
import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		long stime;	//���۽ð�
		long etime;	//����ð�
		long ctime;	//�����ð�
		
		//LinkedList�� ������ ���� ����Ѽ����� ����, ArrayList�� �ε����� ���ٽÿ��� �� ����
		//LinkedList ��������
		stime = System.nanoTime();
		for(int x=0; x<10000; x++) {
			llist.add(0, String.valueOf(x));	//0~10000���� ���� String���·� ����
		}
		etime = System.nanoTime();
		ctime = (etime - stime)/1000000;	//�ʴ����� ȯ��
		System.out.println("LinkedList ��ü���� �ð�: "+ctime+"��");
		
		//ArrayList ��������
		stime = System.nanoTime();
		for(int x=0; x<10000; x++) {
			alist.add(0, String.valueOf(x));
		}
		etime = System.nanoTime();
		ctime = (etime - stime)/1000000;
		System.out.println("ArrayList ��ü���� �ð�: "+ctime+"��");
		
		//Vector ��������
		stime = System.nanoTime();
		for(int x=0; x<10000; x++) {
			vector.add(0, String.valueOf(x));
		}
		etime = System.nanoTime();
		ctime = (etime - stime)/1000000;
		System.out.println("Vector ��ü���� �ð�: "+ctime+"��");
	}
}
