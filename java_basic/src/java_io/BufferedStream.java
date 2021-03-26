package java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class BufferedStream {
	public static void main(String[] args) throws IOException {
		System.out.println("문자를 입력하고 엔터를 치세요");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		System.out.println("입력한 문자: "+str);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println("출력한 문자: 출력!");
		bw.flush();
	}
}
