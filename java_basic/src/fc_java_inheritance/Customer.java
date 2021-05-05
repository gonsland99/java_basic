package fc_java_inheritance;

public class Customer {
	protected int customerID;	//protected: 상속받는 하위클래스 접근허용
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; 	//package(default): 패키지 내 접근허용
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";	//회원등급
		bonusRatio = 0.01;	//할인율
	}
	
	public int calcPrice(int price) {	//할인적용 구매가격
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + 
				", 보너스 포인트: " + bonusPoint;
		
	}
}
