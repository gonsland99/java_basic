package java_MultipleDataProcesse;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEx {
	public static void main(String[] args) {
		//Map: 키를 통해 값을 얻음
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		//Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put(1, "홍길동");
		ht.put(2, "손흥민");
		ht.put(3, "아이유");
		System.out.println("키 개수: "+ht.size());
		System.out.println("2번 키로 값찾기: "+ht.get(2));
		
		Set<Integer> ks = ht.keySet();
		//iterator: 컬렉션에 대해 순차적으로 값을 가져옴
		//사용이유: List, set 컬렉션 변경시에도 영향을 받지 않음
		//enumeration: 자바초기에 사용되어 현재는 iterator가 모든구현 가능
		Iterator<Integer> ki = ks.iterator();
		while(ki.hasNext()) {
			int k = ki.next();
			String v = ht.get(k);
			System.out.println("키: "+k+" 값: "+v);
		}
		
	}
}
