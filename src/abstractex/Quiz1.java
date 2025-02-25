package abstractex;

public class Quiz1 {

	public static void main(String[] args) {
	
		Avante avante = new Avante();
		avante.Start();
		avante.drive();
		avante.stop();
		avante.turnoff();
		
		Sonata Sonata = new Sonata();
		Sonata.Start();
		Sonata.drive();
		Sonata.stop();
		Sonata.turnoff();
	}
}
abstract class Car {
	
	public abstract void Start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
}
class Avante extends Car {

	@Override
	public void Start() {
		System.out.println("Avante 시동을 켭니다.");
	}
	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");
	}
	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}
	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다.");	
	}
}
class Sonata extends Car {

	@Override
	public void Start() {
		System.out.println("Sonata 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");	
		
	}
	
}