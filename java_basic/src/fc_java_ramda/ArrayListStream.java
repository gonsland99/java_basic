package fc_java_ramda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Son");
		name.add("Park");
		name.add("Messi");
		
		//for문으로 출력
		for(String n : name) {
			System.out.print(n+" ");
		}System.out.println();
		
		//Stream으로 출력 (스트림은 한번만 사용가능)
		Stream<String> st = name.stream();
		st.forEach(s->System.out.print(s+" ")); System.out.println();
		
		name.stream().sorted().forEach(s->System.out.print(s+" "));	System.out.println();
		name.stream().map(s->s.length()).forEach(s->System.out.print(s+" ")); System.out.println();
		name.stream().filter(s->s.length()>=4).forEach(s->System.out.print(s+" "));
	}
}
