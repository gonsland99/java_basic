package java_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InStreamReader {
	static String name;
	public static void main(String[] args) {
		int inData = -1;
		Reader isr = new InputStreamReader(System.in);
		System.out.println("Ű���� �����Է�(�Է� �� ����)");
		System.out.println("-----------------------");
		
		try {
			while(true) {
				inData = isr.read();
				if(inData == -1)
					break;
				System.out.println((char)inData);
			}
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
