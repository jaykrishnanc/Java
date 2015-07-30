public class Tenor extends Singer {
	public static String sing() { return "fa";}
	public static void main( String[] args) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}
}
class Singer {
	public static String sing() { return "la"; }
}


/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ javac Tenor.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter2$ java Tenor
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
fa la


*/
