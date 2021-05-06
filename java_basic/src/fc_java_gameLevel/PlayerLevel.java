package fc_java_gameLevel;

public abstract class PlayerLevel {
	abstract public void run();
	abstract public void jump();
	abstract public void turn();
	abstract public void showLevelMessage();
	public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
