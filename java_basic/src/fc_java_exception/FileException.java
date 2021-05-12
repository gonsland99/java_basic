package fc_java_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileException {
	public static void main(String[] args) {
		//java9부터는 자동으로 close가 가능(try-with-resource)
		//ex) try(FileInputStream fis = new FileInputStream("a.txt")
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		}catch(IOException e) {
			System.out.println(e);
			return;
		}finally {	//return을 해도 finally는 무조건 출력
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}
}
