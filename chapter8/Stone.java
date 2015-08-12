public class Stone {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(">" + doStuff(s) + "<");
	}
	static String doStuff(String s) {
		s = s.concat(" ef h ");
		return s.trim();
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter8$ java Stone
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
>abc ef h<

*/
