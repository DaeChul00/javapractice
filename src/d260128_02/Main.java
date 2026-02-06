package d260128_02;

public class Main {

	public static void main(String[] args) {
		Dog dog=new Dog("멍멍이");
		dog.sound();
		dog.callName();
		dog.run();
		
		Animal cat=new Cat("야옹이");
		cat.sound();
		cat.callName();
		
		Cat2 cat2=new Cat2("야옹이2") {
			
			@Override
			public void callName() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void jump() {
				System.out.println("고양이 점프!!");
			}

			@Override
			public void sound() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Dog3 dog3=new Dog3("장군이");
		
	}

}
