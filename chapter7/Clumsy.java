public class Clumsy {
	public static void main(String[] args) {
		int j = 7;
		assert(++j > 7);
		assert(++j > 8) : "hi" ;
		assert(j > 10 ) : doStuff();
		assert(j == 12) : new Clumsy();
	}
	static void doStuff() {}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac Clumsy.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Clumsy.java:9: error: cannot find symbol
	static coid doStuff() {}
	       ^
  symbol:   class coid
  location: class Clumsy
1 error
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac Clumsy.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Clumsy.java:6: error: 'void' type not allowed here
		assert(j > 10 ) : doStuff();
		                         ^
1 error

*/
