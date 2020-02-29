package january12;

public class Student {

// Adding fields, method and constructor
	
	String name;
	int id;
	String collegeName;
	String department;

// Constructor is a method which has the same name as the class. 
	// This method is called at first when the class is called. 
	// Generally it is used to initialize variables.

	Student(String iname, int iid, String iCollege, String idepartment){
		name = iname;
		id = iid;
		collegeName = iCollege;
		department = idepartment;
	}
	
	Student(String iname, int iid, String idepartment){
		name = iname;
		id = iid;
		collegeName = "Dhole Patil";
		department = idepartment;
	}
	// Methods
	void attendLecture() {
		System.out.println (name + " attends Lecture.");
	}
	
	void appearsForExam() {
		System.out.println (name + " attends exam with ID: " + id);
	}
	
	void studiesInDepartment() {
		System.out.println (name + " studies in Department: " + department);
	}
	
	void goesToCollege() {
		
		System.out.println (name + " goes to College: " + collegeName);
	}
	
	public static void display () {
		
	}
	
	String returnName() {
		name = "Radical";
		// This hardcoded assignment of variable "name" will overwrite the constructor passed value.
		return name;
	}
	
	int returnId() {
		return id;
	}
}

// This class cannot be run by JVM as it doesn't have main method. In order to run it, user has to call this class's object in some other main method. For example Execution.java 

// Constructor - name must be same as class name, it must have no explicit return type, it cannot be abstract/static/final. 
// There are 2 types of constructors - parameterized constructor and default constructor (with no parameters).