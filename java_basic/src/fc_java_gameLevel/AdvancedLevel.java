package fc_java_gameLevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("평범하게 달린다");
	}
	@Override
	public void jump() {
		System.out.println("낮은 점프");
	}
	@Override
	public void turn() {
		System.out.println("천천히 턴");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("====== 중급자 레벨 ======");
	}
}
