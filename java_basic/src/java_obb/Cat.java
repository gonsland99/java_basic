package java_obb;

public class Cat extends Animal{
	public static void ClassMethod(){
		System.out.println("Ŭ�����޼ҵ�2");
	}
	public void InstanceMethod(){
		System.out.println("�ν��Ͻ��޼ҵ�2");
	}
	public void test() {
		System.out.println("�׽�Ʈ");
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = c;
		
		Animal.ClassMethod();
		a.ClassMethod();	 
		c.ClassMethod();	//�޼ҵ�����
		a.InstanceMethod();
		c.InstanceMethod();
		c.test();
	}
}
