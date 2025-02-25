package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		// 컴퓨터 인스턴스 생성
		// 추상클래슨ㄴ 완전한 클래스가 아니므로 인스턴스를 생성할 수 없다
//		Computer computer = new Computer();
		
		// 자식 클래스로 인스턴스 생성
		DeskTop desktop = new DeskTop();
		NoteBook notebook = new NoteBook();
		
		desktop.turnOn();
		desktop.turnOff();
		desktop.display();
		desktop.typing();

		notebook.turnOn();
		notebook.turnOff();
		notebook.display();
		notebook.typing();

	}

}
// 추상 클래스
// 추상 메소드를 하나 이상 가지고 있는 메소드
// 일반함수, 추상함수 모두 가질 수 있음
abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	// 고유기능
	// 컴퓨터 ㅈㅇ류마다 화면을 표시하는 방법과 타이핑하는 방법이 다름
	// 추상 메소드
	public abstract void display();
	public abstract void typing();	
}
class DeskTop extends Computer { 

	@Override
	public void display() { 
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() { 
		System.out.println("DeskTop Typing()");
	}

}

class NoteBook extends Computer {

	@Override
	public void display() { // 물려받은 추상메소드 구현
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() { // 물려받은 추상메소드 구현
		System.out.println("NoteBook Typing()");
	}

}
