package java_basic;

public class Escape {
	public static void main(String[] args) {
// 이스케이프 문자 '\'
		char c = '\n';	//escape문자는 컴퓨터가 1개 문자로 인식
		System.out.println("이스케이프 문자 ");
		System.out.print("\\n: 다음줄로\n");
		System.out.println("\\t: \t탭");
		System.out.println("\\: 문자사용 ");
		System.out.println("\": 문자사용");
	}
}
