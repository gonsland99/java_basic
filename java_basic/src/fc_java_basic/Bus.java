package fc_java_basic;

public class Bus {
	int busNum;
	int money;
	int passenger;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	public void busInfo() {
		System.out.println(busNum+"번 버스의 승객수는 "+passenger+"수입은 "+money+"원 입니다.");
	}
}
