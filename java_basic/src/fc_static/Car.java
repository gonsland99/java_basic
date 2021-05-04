package fc_static;

public class Car {
	//자동차 번호 생성
	private static int serialNum = 10000; //static을 이용한 데이터고정
	public int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	public int getCarNum() {
		return carNum;
	}
	
}
