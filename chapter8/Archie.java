import java.util.regex.*;
public class Archie {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		int count = 0;
		while(m.find())
			count++;
		System.out.print(count);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Archie "\d+" ab2c4d67
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
3

*/
