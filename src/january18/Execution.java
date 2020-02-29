package january18;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInstanceVariable obj = new StaticInstanceVariable();
		obj.display();
		obj.increement();
		obj.display();

		System.out.println(" ============ Another new Object =============");
		StaticInstanceVariable obj1 = new StaticInstanceVariable();
		obj1.display();
		obj1.increement();
		obj1.display();
		
		System.out.println(" ============ Another new Object =============");
		StaticInstanceVariable obj2 = new StaticInstanceVariable();
		obj2.display();
		obj2.increement();
		obj2.display();
	}

}
