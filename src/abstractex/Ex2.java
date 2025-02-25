package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.breathe();
		cat.sound();
		
		Animal dog = new Dog();
		dog.breathe();
		dog.sound();

	}

}
abstract class Animal {
	public void breathe( ) {
		System.out.println("동물이 숨을 쉽니다");
	}
	// 동물마다 내는 소리가 다르기때문에 추상메소드로 선언
	// 실제 소리는 자식클래스에서 정의할 것
	public abstract void sound();
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("미야");
		
	}
}
class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("바우와우");
		
	}
	
}