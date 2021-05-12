package fc_java_ramda;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
	public static void main(String[] args) {
		Customer customerS = new Customer("손흥민", 20, 100);
		Customer customerR = new Customer("로다주", 40, 100);
		Customer customerI = new Customer("아이유", 13, 50);
		
		List<Customer> cList = new ArrayList<>();
		cList.add(customerS);
		cList.add(customerR);
		cList.add(customerI);
		
		System.out.println("=== 고객 명단 ===");
		cList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("=== 여행 비용 ===");
		System.out.println(cList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("=== 20세 이상고객 ===");
		cList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
