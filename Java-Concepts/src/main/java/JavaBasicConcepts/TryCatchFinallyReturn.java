package JavaBasicConcepts;

public class TryCatchFinallyReturn {

	public static int returnSomething() {
		try {
			String str = "2";
			Integer intValue = Integer.valueOf(str);
			return 1;
		} catch(Exception ex) {
			return 2;
		} finally {
			System.out.println("Finally");
			//return 3;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(returnSomething());
	}
}
