package january18;

public class StaticInstanceVariable {

	int counter = 0;
	static int counter1 = 0;
	
	void increement(){
		counter++;
		counter1++;
	}
	
	void display() {
		System.out.println("Instance variable: "+counter);
		System.out.println("Static Variable: "+counter1);
	}
	
}
