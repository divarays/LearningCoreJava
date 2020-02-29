package january12;

public class Execution {

	public static void main(String args[]) {
		
// Keyword new: JVM allocates space in memory as soon as JVM reads a keyword "new" in variable assignment.
		
		Student amol = new Student("Amol", 123, "GGS", "Computer");
		amol.attendLecture();
//		amol.goesToCollege();
		
		Student saloni = new Student("Saloni", 456, "Savitribai Phule", "Electronics");
		saloni.appearsForExam();
//		saloni.studiesInDepartment();
		
		amol.studiesInDepartment();

		Student rohan = new Student ("Rohan", 777, "Mechanical");
		rohan.attendLecture();
		rohan.goesToCollege();
		
		System.out.println(saloni.returnName());
		
		System.out.println(rohan.returnId());

		saloni.getClass();
		saloni.hashCode();
		}
	
}


// class Object: is superclass in Java
// Why Java is statically declared language - because user has to declare a variable - for example field type like String/integer, for exmaple class type for objects etc.
// String - is a class and a data type.
// int - is a data type.
// one method can return only one variable of return type.