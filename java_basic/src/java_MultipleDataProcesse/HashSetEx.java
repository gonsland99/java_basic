package java_MultipleDataProcesse;
import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		//set: �������� �ߺ����� �Ұ���
		HashSet<String> set = new HashSet<>();	//hash set ����
		set.add("A");	//��ü�� ������ �߰�
		set.add("b");
		set.add("CD");
		set.add("efg");
		
		System.out.println("������ ����: "+set.size());	//��ü �� ������ ����
		set.remove("CD");
		System.out.println("������ ����: "+set.size());
		
		for(String a : set) {
			System.out.print(a+"\t");
		}
		//iterator: �÷��� �� �����͸� �ϰ��� ������� ó���ϴ� �������̽�
		/*
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String a = it.next();
			System.out.print(a+"\t");
		}
		*/
	}
}
