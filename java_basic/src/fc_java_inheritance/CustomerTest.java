package fc_java_inheritance;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		//Customer 생성
		Customer customer1 = new Customer(101, "이순신");
		Customer customer2 = new GoldCustomer(102, "김유신");
		Customer customer3 = new VIPCustomer(103, "손흥민");
		Customer customer4 = new VIPCustomer(104, "아이유");
		
		//Customer ArrayList 추가
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		
		//Customer 결과 출력
		for(Customer customers : customerList) {
			int price = customers.calcPrice(10000);
			System.out.println(customers.showCustomerInfo()+", 구매가격: "+price);
		}
	}
}
