package fc_java_basic;

public class Transportation {
	public static void main(String[] args) {
		Students james = new Students("james", 5000);
		Students tomas = new Students("tomas", 10000);
		Bus bus100 = new Bus(100);
		Subway green = new Subway("green");
		
		james.takeBus(bus100);
		tomas.takeSubway(green);
		
		james.showInfo();
		tomas.showInfo();
		bus100.busInfo();
		green.subwayInfo();
	}
}
