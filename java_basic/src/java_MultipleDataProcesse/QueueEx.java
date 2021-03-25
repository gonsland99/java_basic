package java_MultipleDataProcesse;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		//큐(FIFO선입선출)는 LinkedList를 사용한다.
		Queue<QueueDTO> q = new LinkedList<>();
		//LinkedList<QueueDTO> q = new LinkedList<>();
		
		q.offer(new QueueDTO("입출금", 1));
		q.offer(new QueueDTO("대출", 2));
		q.offer(new QueueDTO("입출금", 3));
		q.offer(new QueueDTO("상담", 4));
		
		while(q.peek() != null) {	//peak: 큐에 처음있는 값을 삭제하지 않고 가져옴
			QueueDTO qu = q.poll();	//poll: 큐에 처음있는 값을 삭제하고 가져옴
			switch (qu.oper) {
			case "입출금":
				System.out.println(qu.num+"번 고객님 "+qu.oper+" 창구로 오세요.");
				break;
			case "대출":
				System.out.println(qu.num+"번 고객님 "+qu.oper+" 창구로 오세요.");
				break;
			default:
				System.out.println(qu.num+"번 고객님 "+qu.oper+" 창구로 오세요.");
				break;
			}
		}
	}
}
