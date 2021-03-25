package java_MultipleDataProcesse;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		//ť(FIFO���Լ���)�� LinkedList�� ����Ѵ�.
		Queue<QueueDTO> q = new LinkedList<>();
		//LinkedList<QueueDTO> q = new LinkedList<>();
		
		q.offer(new QueueDTO("�����", 1));
		q.offer(new QueueDTO("����", 2));
		q.offer(new QueueDTO("�����", 3));
		q.offer(new QueueDTO("���", 4));
		
		while(q.peek() != null) {	//peak: ť�� ó���ִ� ���� �������� �ʰ� ������
			QueueDTO qu = q.poll();	//poll: ť�� ó���ִ� ���� �����ϰ� ������
			switch (qu.oper) {
			case "�����":
				System.out.println(qu.num+"�� ���� "+qu.oper+" â���� ������.");
				break;
			case "����":
				System.out.println(qu.num+"�� ���� "+qu.oper+" â���� ������.");
				break;
			default:
				System.out.println(qu.num+"�� ���� "+qu.oper+" â���� ������.");
				break;
			}
		}
	}
}
