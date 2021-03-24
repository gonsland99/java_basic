package java_obb;

public class Cat extends Animal{
	public static void ClassMethod(){
		System.out.println("클래스메소드2");
	}
	public void InstanceMethod(){
		System.out.println("인스턴스메소드2");
	}
	public void test() {
		System.out.println("테스트");
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = c;
		
		Animal.ClassMethod();
		a.ClassMethod();	 
		c.ClassMethod();	//메소드은닉
		a.InstanceMethod();
		c.InstanceMethod();
		c.test();
	}
}
