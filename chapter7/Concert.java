public class Concert {
	static class PowerOutage extends Exception { }
	static class ThunderStorm extends Exception { }
	public static void main (String[] args) {
		try {
			new Concert().listen();
			System.out.println("a");
		}
		catch (PowerOutage | ThunderStorm e) {
			e = new PowerOutage();
			System.out.println("b");
		}
		finally {
			System.out.println("c");
		}
	}
	public void listen() throws PowerOutage, ThunderStorm {}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac Concert.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Concert.java:10: error: multi-catch parameter e may not be assigned
			e = new PowerOutage();
			^
1 error

*/
