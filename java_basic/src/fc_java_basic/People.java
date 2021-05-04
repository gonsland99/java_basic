package fc_java_basic;

public class People {
	int height, weight, age = 0;
	String gender, name = "";
	
	public People(int h, int w, int a, String g, String n) {
		this.height = h;
		this.weight = w;
		this.age = a;
		this.gender = g;
		this.name = n;
	}
	public void showPeopleInfo() {
		System.out.println("이름"+name+" 키"+height+" 몸무게"+weight+" 나이"+age+" 성별"
				+ ""+gender+"입니다.");
	}
	public static void main(String[] args) {
		People tomas = new People(180, 78, 37, "남자", "tomas");
		tomas.showPeopleInfo();
	}
}
