class Car implements Comparable<Car>{
	private String model;
	private String color;
	private int speed;
	Car(String model,String color,int speed){
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
	public int compareTo(Car carr) {
		return Integer.compare(this.speed, carr.speed);
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public String toString() {
		return model+" "+color+" "+speed;
	}
}
public class Q3 {

	public static void main(String[] args) {
		Car c1=new Car("Honda Civic","Blue",140);
		Car c2=new Car("Honda City","Black",150);
		System.out.println(c1);
		System.out.println(c2);
		int comp=c1.compareTo(c2);
		if(comp<0) {
			System.out.println("car2 has more speed");
		}
		else if(comp>0) {
			System.out.println("car1 has more speed");
		}
		else {
			System.out.println("same speed");
		}
	}

}
