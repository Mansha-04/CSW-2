public class CarTester{	
	
	public static class Car{
		private String make;
		private String model;
		Car(String make,String model){
			this.make=make;
			this.model=model;
		}
		public void setValue(String make,String model){
			this.make=make;
			this.model=model;
		}
		public void getValues() {
			System.out.println("make: "+this.make+"  model: "+this.model);
			
		}
	}
	public static void main(String[] args) {
		Car Car1=new Car("Honda City","Honda CR-V" );
		Car Car2=new Car(null,null);
		Car1.getValues();
		Car2.getValues();
		
		Car2.setValue("volkswagen","Vitrus");

		Car1.getValues();
		Car2.getValues();

	}

}
