package JavaBasicConcepts;

public class Constructors {

	Constructors(String name) {
		System.out.println("Constructor with one arguement, Name: " + name);
	}

	Constructors(String name, int age) {
		System.out.println("Constructor with two arguements, Name: " + name + ", Age: " + age);
	}

	Constructors() {
		System.out.println("Default constructor"); //arg less constructor
	}

	public static void main(String[] args) throws Exception {
		Constructors const1 = new Constructors();

		Constructors const2 = new Constructors("Smith");

		Constructors const3 = new Constructors("John", 25);
	}

}
