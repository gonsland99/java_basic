package java_MultipleDataProcesse;
import java.util.*;

public class VectorEx {
	public static void main(String[] args) {
		//�ε�������� �ߺ�����(�������) ���������� ������ũ�� ��ȯ
		Vector<Info> vt = new Vector<>();
		//��ü�� Ȯ��
		vt.add(new Info("ȫ�浿", "010-1111-1111", "����"));
		vt.add(new Info("�����", "010-7777-7777", "����"));
		vt.add(new Info("���缮", "010-5555-5555", "����"));
		System.out.println("��ü ��: "+vt.size());
		System.out.println("�뷮 : "+vt.capacity());
		
		vt.remove(2);
		/*
		for(int i=0; i<vt.size(); i++) {
			Info in = vt.get(i);
			System.out.println(in.name+" "+in.tel+" "+in.add);
		}
		*/
		for(Info a : vt) {
			System.out.println(a.name+" "+a.tel+" "+a.add);
		}
		
	}
}
