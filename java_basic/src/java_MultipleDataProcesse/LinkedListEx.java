package java_MultipleDataProcesse;
import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		long stime;	//시작시간
		long etime;	//종료시간
		long ctime;	//측정시간
		
		//LinkedList가 성능이 조아 빈번한수정시 용이, ArrayList가 인덱스로 접근시에는 더 빠름
		//LinkedList 성능측정
		stime = System.nanoTime();
		for(int x=0; x<10000; x++) {
			llist.add(0, String.valueOf(x));	//0~10000까지 수를 String형태로 저장
		}
		etime = System.nanoTime();
		ctime = (etime - stime)/1000000;	//초단위로 환산
		System.out.println("LinkedList 객체삽입 시간: "+ctime+"초");
		
		//ArrayList 성능측정
		stime = System.nanoTime();
		for(int x=0; x<10000; x++) {
			alist.add(0, String.valueOf(x));
		}
		etime = System.nanoTime();
		ctime = (etime - stime)/1000000;
		System.out.println("ArrayList 객체삽입 시간: "+ctime+"초");
		
		//Vector 성능측정
		stime = System.nanoTime();
		for(int x=0; x<10000; x++) {
			vector.add(0, String.valueOf(x));
		}
		etime = System.nanoTime();
		ctime = (etime - stime)/1000000;
		System.out.println("Vector 객체삽입 시간: "+ctime+"초");
	}
}
