package d260206;
//일반적인 프로그램은 순서에 의해서 프로그램이 실행 됨
//main함수는 하나의 쓰레드(작업)이다
public class Main {

	public static void main(String[] args) {
		//쓰레드로 구현한 클래스가 맨 마지막에 있으면 main을 실행한 후 Thread Class가 실행되므로 순차적으로 보이지만
		//앞쪽에 위치하면 작업은 백그라운드에 돌아가고 main과 함께 실행되는 구조
		new ThreadClass().start();
		
		for(int i=0;i<100;i++) {
			System.out.println("main:"+i);
		}
		new GenClass().start();

	}

}

//아래의 클래스는 thread를 구현하기 위한 모든 함수가 존재하지 쓰레드로 구현된 클래스가 아니다.
class GenClass{
	public void start() {
		run();
	}
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("일반적인 클래스실행함수(gen):"+i);
		}
	}
}

//쓰레드 클래스 생성
//쓰레드를 만들기 위해서는 Thread를 상속하는 방법이 있음(방법1)
class ThreadClass extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("thread class:"+i);
		}
	}
}