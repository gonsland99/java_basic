package java_basic;


public class Memo {
	public static void main(String[] args) {
		//자료 형변환
		String str = "10";
		int num = 10;
		String a = String.valueOf(num);	//숫자를 문자로 변환
		//parseInt는 자료형, valueOf는 객체형태로 리턴한다.
		int b = Integer.parseInt(str);	//문자를 숫자로 변환
//		int b = Integer.valueOf(str);	//문자를 숫자로 변환2

		System.out.println(a+str);
		System.out.println(b+num);
		//객체형태로 리턴된 값
//		System.out.println(Integer.parseInt("20"));
//		System.out.println(a + b);
		
/*
	// 표기법
		변수
		ㄴ숫자,공백,특수문자x
		1.파스칼 표기법: 첫글자를 대문자, 2개이상 단어 결합시 각단어 첫글자 대문자 표기하는 기법	(클래스작성법)
		ex)MaxSpeed, Hello, ColorOfRing
		2.카멜 표기법: 첫 글자는 소문자, 2개이상 단어 결합시 2번째 단어부터 첫글자 대문자 표기하는 기법		(변수,매소드)
		ex)maxSpeed, hello, colorOfRing
		3.스네이크 표기법: 모든 문자를 소문자, 2개이상 단어 결합시 (_)를 사용해 연결하는 기법		(상수는 모두 대문자)
		ex)max_speed, hello, color_of_ring
		4.헝가리안 표기법: 헝가리 사람이 먼저사용한 표기법, 약어사용
		ex)iMS, she, sCor, iNum
	
		세미콜론(;): 사람이 줄바꿈을 한줄 끝으로 인식하듯 컴퓨터가 한줄의 끝으로 인식
		ㄴ컴퓨터는 엔터와 공백, 여러개의 공백도 하나의 공백으로 취급 
	//타입	
		byte	1
		short	2
		int		4byte = 32bit
		long	8
		float 	4
		double	8
		boolean	가변
		char	2
	//소수점	
		고정소수점:부호비트,지수부15bit,가수부15bit
		부동소수점:부호비트,지수부8bit,가수부23bit
		 ㄴ지수부에 e를 써서 표현
	//코드 테이블	
		ASCII: keycode값들을 표현한 미국식 코드표
		UNICODE: 전세계어들을 표현한 테이블
	//연산자 계산 순서
	 	괄호 > 단항 > 산술 > 비교 > 논리 
*/
	}
}
