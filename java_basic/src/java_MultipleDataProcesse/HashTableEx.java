package java_MultipleDataProcesse;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEx {
	public static void main(String[] args) {
		//Map: Ű�� ���� ���� ����
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		//Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put(1, "ȫ�浿");
		ht.put(2, "�����");
		ht.put(3, "������");
		System.out.println("Ű ����: "+ht.size());
		System.out.println("2�� Ű�� ��ã��: "+ht.get(2));
		
		Set<Integer> ks = ht.keySet();
		//iterator: �÷��ǿ� ���� ���������� ���� ������
		//�������: List, set �÷��� ����ÿ��� ������ ���� ����
		//enumeration: �ڹ��ʱ⿡ ���Ǿ� ����� iterator�� ��籸�� ����
		Iterator<Integer> ki = ks.iterator();
		while(ki.hasNext()) {
			int k = ki.next();
			String v = ht.get(k);
			System.out.println("Ű: "+k+" ��: "+v);
		}
		
	}
}
