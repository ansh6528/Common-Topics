package JavaBasicConcepts;

//main class
public class Abstraction {
	
	public static void main(String[] args) {
		multiplication mp = new multiplication();
		System.out.println(mp.multiply(9));
	}
	
}

//abstract class
//parent class
abstract class AbstractClass {
	int val;
	
	//constructor keyword of parent class
	public AbstractClass(int val) {
		this.val = val;
	}
	//abstract method of parent class
	abstract int multiply(int num);
}

//class which extends the abstract class
class multiplication extends AbstractClass {
	
	//constructor of child class
	public multiplication() {
		//super keyword refers to the constructor of the parent class
		super(2);
	}
	
	//defining the abstract method of the parent class 
	public int multiply(int num) {
		//returning the value of the same instance
		return this.val * num;
	}
}
