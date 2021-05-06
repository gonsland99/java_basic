package fc_java_gameLevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("빠르게 달린다");
	}
	@Override
	public void jump() {
		System.out.println("높은 점프");
	}
	@Override
	public void turn() {
		System.out.println("빠르게 턴");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("====== 고급자 레벨 ======");
	}
}
