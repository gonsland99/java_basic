package java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class BufferedStream {
	public static void main(String[] args) throws IOException {
		System.out.println("���ڸ� �Է��ϰ� ���͸� ġ����");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		System.out.println("�Է��� ����: "+str);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println("����� ����: ���!");
		bw.flush();
	}
}
