package january17;

public class ExecutionCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car swift = new Car ("Swift", "Red", 2010);
		swift.displayDetails();
		// Class variable
		Car.changeGear(Car.noOfGear = 2);
		System.out.println("The driver has applied the brakes and speed is reduced to "+swift.applyBreak()+".");
		
		System.out.println("================ Testing the default Constructor call. ================ ");
		Car santro = new Car();
		santro.displayDetails();
		
		System.out.println("================ Testing the keyword <this>. ================ ");
		Car civic = new Car("Honda Civic", "White", 2012, (float) 2.5);
		System.out.println("The reduced speed after applying brakes is "+ civic.applyBreak());
		//civic.displayDetails();
	}

}

