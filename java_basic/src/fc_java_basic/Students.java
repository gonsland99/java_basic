package fc_java_basic;

public class Students {
	String name;
	int money;
	
	public Students(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	public void showInfo() {
		System.out.println(name+"의 남은 돈은 "+money+"원 입니다.");
	}
}
