interface Vehicle{
	public abstract void accelerate();
	public abstract void brake();
}
class Car implements Vehicle{
	public void accelerate() {
		System.out.println("car is accelerating");
	}
	public void accelerate(double speed) {
		System.out.println("car is accelerating at speed"+speed);
	}
	public void accelerate(int duration) {
		System.out.println("car is accelerating for "+duration);
	}
	public void brake() {
		System.out.println("applying brakes");
	}
}
class Bicycle implements Vehicle{
	public void accelerate() {
		System.out.println("Bicycle is accelerating");
	}
	public void accelerate(double speed) {
		System.out.println("Bicycle is accelerating at speed"+speed);
	}
	public void accelerate(int duration) {
		System.out.println("Bicycle is accelerating for "+duration);
	}
	public void brake() {
		System.out.println("applying brakes");
	}
}
public class Q8 {

	public static void main(String[] args) {
		Car c=new Car();
		Bicycle b=new Bicycle();
		c.accelerate();
		c.accelerate(30.8);
		c.accelerate(20);
		c.brake();
		b.accelerate();
		b.accelerate(22.9);
		b.accelerate(80);
		b.brake();
	}

}
