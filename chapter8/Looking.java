import java.util.*;
public class Looking {
	public static void main(String[] args) {
		String input = "1 2 a 3 45 6";
		Scanner sc = new Scanner(input);
		int x = 0;
		do {
			x = sc.nextInt();
			System.out.print(x + " ");
		}
		while(x!=0);
	}
}


/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java LookingPicked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
1 2 Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at Looking.main(Looking.java:8)


*/
