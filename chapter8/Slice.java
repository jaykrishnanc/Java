import java.text.*;
public class Slice {
	public static void main(String[] args) { 
	String s = "987.123456";
	double d = 987.123456d;
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(5);
	System.out.println(nf.format(d) + " ");
	try {
		System.out.println(nf.parse(s));}
	catch (Exception e) {
		System.out.println("got exc");
	}
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ javac Slice.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Slice
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
987.12346 
987.123456

*/
