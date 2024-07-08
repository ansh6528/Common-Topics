package JavaBasicConcepts;

@FunctionalInterface
interface functionalInterface {
    public void hello(String param1);
    
    default void printName() {
    	System.out.println("This is a default method");
    }
}

public class LambdaExpressions {

	public static void main(String[] args) {
        functionalInterface funcInterfaceObj = (String name) -> {  //definition of functional interface hello method
            System.out.println("Definition of Functional Interface Method with input as: " + name);
        };
        funcInterfaceObj.hello("Hello"); //calling the functional interface method
        funcInterfaceObj.printName(); //calling the default method of the functional interface
    }
}
