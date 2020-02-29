package january12;

public class NewBike {
	
	String name;
	int speed;
	int gears;

	NewBike (String iname, int ispeed, int igears){
	name = iname;
	speed = ispeed;
	gears = igears;
	}
	
	void displayName() {
		System.out.println("The bike name is " + name);
	}

	void displaySpeed(int speed) {
		System.out.println("The maximum speed is " + speed);
	}
	
	int returnGears() {
		return gears;
	}
	
}
