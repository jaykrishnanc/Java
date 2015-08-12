public class Legos {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(8);
		System.out.print(sb.length() + " " + sb + " ");
		sb.insert(0,"abcdef");
		sb.append("789");
		System.out.println(sb.length() + " " + sb);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Legos
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
0  9 abcdef789

*/
