package java_MultipleDataProcesse;
import java.util.*;

public class VectorEx {
	public static void main(String[] args) {
		//인덱스순대로 중복가능(참조방식) 가변적으로 데이터크기 변환
		Vector<Info> vt = new Vector<>();
		//객체수 확인
		vt.add(new Info("홍길동", "010-1111-1111", "조선"));
		vt.add(new Info("손흥민", "010-7777-7777", "영국"));
		vt.add(new Info("유재석", "010-5555-5555", "서울"));
		System.out.println("객체 수: "+vt.size());
		System.out.println("용량 : "+vt.capacity());
		
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
