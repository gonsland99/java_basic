package fc_java_inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int id, String name) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override //오버라이드를 통해 재정의 함수명 오타예방 가능
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + 
				", 보너스 포인트: " + bonusPoint;
	}
}
