package fc_java_basic;

public class Transportation {
	public static void main(String[] args) {
		Students james = new Students("james", 5000);
		Students tomas = new Students("tomas", 10000);
		Students edward = new Students("edward", 20000);
		Bus bus100 = new Bus(100);
		Subway greenSubway = new Subway("green");
		Taxi kakaoTaxi = new Taxi("kakao");
		
		james.takeBus(bus100);
		tomas.takeSubway(greenSubway);
		edward.takeTaxi(kakaoTaxi);
		
		james.showInfo();
		tomas.showInfo();
		edward.showInfo();
		bus100.busInfo();
		greenSubway.subwayInfo();
		kakaoTaxi.taxiInfo();
	}
}
