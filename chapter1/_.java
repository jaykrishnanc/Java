import static java.lang.System.*;
class _ {
	static public void main(String[] __A_V_) {
		String $ = "";
		for(int x = 0; ++x < __A_V_.length;)
			$ += __A_V_[x];
		out.println($);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter1$ javac _.javaPicked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
_.java:2: warning: '_' used as an identifier
class _ {
      ^
  (use of '_' as an identifier might not be supported in releases after Java SE 8)
1 warning
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter1$ java _ - A
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
A

*/
