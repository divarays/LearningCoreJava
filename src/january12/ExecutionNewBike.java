package january12;

public class ExecutionNewBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewBike pulsar = new NewBike("Bajaj Pulsar", 120, 5);
		pulsar.displayName();
		pulsar.displaySpeed(88);
		System.out.println("The number of Gears are " + pulsar.returnGears());
	}

}
