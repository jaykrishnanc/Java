public class CompareValues {
	public static void main(String[] args) {
		int x = 0;
		while(x++ < 10) {}
		String message = x > 10 ? "Greater Than" : false;
		System.out.println(message + ", " + x);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/common$ javac CompareValues.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
CompareValues.java:5: error: incompatible types: bad type in conditional expression
		String message = x > 10 ? "Greater Than" : false;
		                                           ^
    boolean cannot be converted to String
1 error

*/
