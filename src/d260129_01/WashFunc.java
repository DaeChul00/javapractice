package d260129_01;

public interface WashFunc {

	public void startButton();
	
	public void stopButton();
	
	public void pauseButton();
	
	public void changeButton(int speed);
	default void dry() {};
	default void clean() {};
}
