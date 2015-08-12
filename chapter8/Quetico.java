import java.util.regex.*;
class Quetico {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		System.out.print("match positions: ");
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		System.out.println("");
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Quetico "\b" "^23 *$76 bc"
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
match positions: 1 3 5 6 7 9 

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Quetico "\B" "^23 *$76 bc"
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
match positions: 0 2 4 8 

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Quetico "\S" "^23 *$76 bc"
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
match positions: 0 1 2 4 5 7 8 

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Quetico "\W" "^23 *$76 bc"
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
match positions: 0 3 4 6

*/


