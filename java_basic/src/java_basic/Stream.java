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
		System.out.write('3'+ 1);	//'3'의 다음 문자인 4가 출력
		System.out.write('A'+ 0);
		System.out.write('A'+ 1);
		
		System.out.flush();
		System.out.println();
// InputStream
		Scanner sc = new Scanner(System.in);	//스캐너
		
		System.out.print("두 명의 이름을 입력해 주세요:");
		String text = sc.next();	//공백을 기준으로 값을 나눠 가져옴
//		String text2 = sc.nextLine();	//공백을 상관없이 전부 가져옴
//		System.out.println(text2);
		System.out.println(text);
		System.out.println(sc.hasNext());	//값 참/거짓 판단
		System.out.println(sc.next());		//공백 다음 값 
		System.out.println(sc.hasNext());	
		System.out.println(sc.nextInt());	//정수출력
		sc.close();
// InputStream 2
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	//문자만 입력받을 수 있다.(숫자도 문자로 인식),
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("키보드를 눌러서 문자열을 입력해 주세요.");
		String str = br.readLine();
		System.out.println(str);
	}
}
