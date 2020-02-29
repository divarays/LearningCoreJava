package january18;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; // Variable Declaration
		name = "Pune"; // Variable Initialization
		int year = 2020;
		float value = 10.5f;
		boolean result = true;
		
		
		System.out.println(name +" " +year+" " +value+" " +result);
		
		// Arithmetic Operators
		int x = 10;
		int y = 20;
		
		System.out.println("Addition: "+ (x+y));
		System.out.println("Subtraction: "+ (y-x));
		System.out.println("Multiplication: "+ (x*y));
		System.out.println("Division: "+ (y/x));
		System.out.println("Modulus: "+ (y%x));
		System.out.println("print variable "+ (x++)+" and Post Increment: "+x);
		System.out.println("print variable "+ (y--)+" and Post Decrement: "+y);
		System.out.println("Pre Increment: "+ (++x));
		System.out.println("Pre Decrement: "+ (--y));
		
	}

}
