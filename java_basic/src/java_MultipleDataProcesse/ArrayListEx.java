package java_MultipleDataProcesse;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		//인덱스순대로 중복가능(참조방식) 가변적으로 데이터크기 변환
		List<String> list = new ArrayList<>();
		//객체수 확인
		list.add("dog");
		list.add("cat");
		list.add("pig");
		System.out.println("객체 수: "+list.size());
		
		//for문 출력
		list.add("cow");
		list.add(2,"bird");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//while문 출력
		list.remove(3);
		Iterator e = list.iterator();
		while(e.hasNext()) {
			System.out.print(e.next()+" ");
		}
		System.out.println();
		
		//향상된for문 출력
		list.remove("dog");
		for(String a : list) {
			System.out.print(a+" ");
		}
		
	}
}
