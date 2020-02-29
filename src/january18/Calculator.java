package january18;

public class Calculator {

	int x;
	int y;
	
	Calculator (int ix, int iy){
		x = ix;
		y = iy;
	}
	
	void addition() {
		System.out.println("Addition: "+ (x + y));
			
	}
	
	void subtraction() {
		if (x >= y)
			System.out.println("Subtraction: "+ (x-y));
 		else
			System.out.println("Subtraction: "+ (y-x));
	}
	
	void multiplication() {
		System.out.println("Multiplication: "+ (x*y));	
	}
	
	void division() {
		if (x >= y)
			System.out.println("Division: "+ (x/y));	
		else
			System.out.println("Division: "+ (y/x));	
	}

	void comparison() {
		if (x > y)
			System.out.println("X is greater than y.");	
		else if (x != y)
			System.out.println("Both the numbers are different.");
		else
			System.out.println("Y is greater than x.");
	}

}
