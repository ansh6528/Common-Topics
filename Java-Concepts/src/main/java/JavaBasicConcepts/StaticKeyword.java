package JavaBasicConcepts;

public class StaticKeyword {

	static int counter = 0; // this value will be incremented each time an object is created; If we remove the static keyword, 1 will be printed each time
	int counterVal = 0;
	
	StaticKeyword() {
		counter += 1;
		counterVal = counter;
		
		System.out.println(counterVal);
	}
	
	public static void main(String[] args) {
			StaticKeyword obj1 = new StaticKeyword();
			StaticKeyword obj2 = new StaticKeyword();
			StaticKeyword obj3 = new StaticKeyword();
    }
}
