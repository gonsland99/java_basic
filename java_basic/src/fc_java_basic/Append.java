package fc_java_basic;

public class Append {
	public static void main(String[] args) {
		/*String 문자열을 붙이는 3가지 방법 
			1.+
			2.concat
			3.append
		*/
		String a = "대한";
		String b = "민국";

		System.out.println(a+b); 		 //+
		System.out.println(a.concat(b)); //concat
		
		// append(): String 메모리공간을 추가로 생성하지 않고 문자를 합침
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		sb.append(b);
		System.out.println(sb);
	}
}
