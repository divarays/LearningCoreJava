package january17;

public class Car {
	String name;
	String color;
	int year;
	float petrol;
	static int noOfGear= 5;
	
	Car()
	{
		
	}
	
	Car (String iName, String iColor, int iYear){
		name = iName;
		color = iColor;
		year = iYear;
	}

	// Following constructor shows how to differentiate between local and instance/class variables when the variable names are same. Using Keyword "this"
	Car (String name, String color, int year, float petrol){
		this.name = name;
		this.color = color;
		this.year = year;
		this.petrol = petrol;
		this.displayDetails();
	}
	
	void displayDetails() {
		System.out.println("The car name is <"+name+ "> in <"+color+ "> color and the make of the car is Year <"+year +"> and petrol capacity is <"+petrol +">.");
	}
	
	static void changeGear(int gearNo) {
		System.out.println("The driver changes Gear to "+ gearNo+".");
	}
	
	int applyBreak () {
		return 35 ;
	}
	/* 
// This class can be direactly executed by adding the main method here.
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car swift = new Car ("Swift", "Red", 2010);
		swift.displayDetails();
		swift.changeGear(4);
		System.out.println("The driver has applied the brakes and speed is reduced to "+swift.applyBreak()+".");

	}
	*/
}
