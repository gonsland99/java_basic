package java_MultipleDataProcesse;
import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		//set: 순서없이 중복저장 불가능
		HashSet<String> set = new HashSet<>();	//hash set 정의
		set.add("A");	//객체에 데이터 추가
		set.add("b");
		set.add("CD");
		set.add("efg");
		
		System.out.println("데이터 개수: "+set.size());	//객체 내 데이터 개수
		set.remove("CD");
		System.out.println("데이터 개수: "+set.size());
		
		for(String a : set) {
			System.out.print(a+"\t");
		}
		//iterator: 컬렉션 내 데이터를 일관된 방법으로 처리하는 인터페이스
		/*
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String a = it.next();
			System.out.print(a+"\t");
		}
		*/
	}
}
