package january12;

public class MethodExample {

	void display (String value) {
	System.out.println("The value is "+ value);
	}
	
	int add (int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
// There is no need to write a default constructor. 
	MethodExample(){
		System.out.println("This is default constructor.");
	}
}
