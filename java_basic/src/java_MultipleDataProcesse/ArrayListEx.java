package java_MultipleDataProcesse;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		//�ε�������� �ߺ�����(�������) ���������� ������ũ�� ��ȯ
		List<String> list = new ArrayList<>();
		//��ü�� Ȯ��
		list.add("dog");
		list.add("cat");
		list.add("pig");
		System.out.println("��ü ��: "+list.size());
		
		//for�� ���
		list.add("cow");
		list.add(2,"bird");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//while�� ���
		list.remove(3);
		Iterator e = list.iterator();
		while(e.hasNext()) {
			System.out.print(e.next()+" ");
		}
		System.out.println();
		
		//����for�� ���
		list.remove("dog");
		for(String a : list) {
			System.out.print(a+" ");
		}
		
	}
}
