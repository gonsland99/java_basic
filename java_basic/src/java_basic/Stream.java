package java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream {
	public static void main(String[] args) throws IOException {
// OutputStream		
		System.out.write(3);
		System.out.write('3');
		System.out.write('3'+ 0);
		System.out.write('3'+ 1);	//'3'�� ���� ������ 4�� ���
		System.out.write('A'+ 0);
		System.out.write('A'+ 1);
		
		System.out.flush();
		System.out.println();
// InputStream
		Scanner sc = new Scanner(System.in);	//��ĳ��
		
		System.out.print("�� ���� �̸��� �Է��� �ּ���:");
		String text = sc.next();	//������ �������� ���� ���� ������
//		String text2 = sc.nextLine();	//������ ������� ���� ������
//		System.out.println(text2);
		System.out.println(text);
		System.out.println(sc.hasNext());	//�� ��/���� �Ǵ�
		System.out.println(sc.next());		//���� ���� �� 
		System.out.println(sc.hasNext());	
		System.out.println(sc.nextInt());	//�������
		sc.close();
// InputStream 2
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	//���ڸ� �Է¹��� �� �ִ�.(���ڵ� ���ڷ� �ν�),
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ű���带 ������ ���ڿ��� �Է��� �ּ���.");
		String str = br.readLine();
		System.out.println(str);
	}
}
