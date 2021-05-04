package fc_static;

public class StaticTest {
	private static int serialNum = 100;
	String userName;
	int userId;
	
	public StaticTest(String userName) {
		this.userName = userName;
		serialNum++;
		this.userId = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public String getUserName() {
		return userName;
	}
	/*	변수의 사용
		지역변수: 함수 내 사용, 스택메모리 생성, 함수 끝나면 소멸
		전역(인스턴스)변수: 클래스 내 참조변수로 사용, 힙, 인스턴스 생성시 생성/ 가비지컬렉터 메모리 수거시 소멸
		클래스(static)변수: 클래스 내 클래스명으로 사용, 데이터영역, 프로그램 끝나고 메모리 해재시 소멸
	*/
	public static void main(String[] args) {
		StaticTest user1 = new StaticTest("손흥민"); //전역변수(user1)로서 함수호출 가능
		System.out.println(user1.getUserName()+"의 아이디는 "+StaticTest.getSerialNum()+"번 입니다.");
		
		StaticTest user2 = new StaticTest("아이유");
		System.out.print(user2.getUserName()+"의 아이디는 "+StaticTest.getSerialNum()+"번 입니다.");
		//StaticTest.getSerialNum(); //클래스변수: 인스턴스 없이 클래스명으로 호출가능
	}
}
