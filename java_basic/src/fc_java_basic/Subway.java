package fc_java_basic;

public class Subway {
	String color;
	int money;
	int passenger;
	
	public Subway(String color) {
		this.color = color;
	}
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	public void subwayInfo() {
		System.out.println(color+"색 지하철의 승객수는 "+passenger+"수입은 "+money+"원 입니다.");
	}
}
