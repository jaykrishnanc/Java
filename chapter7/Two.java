class Two {
	public static void main(String[] args) {
		assert(false);
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac -source 1.3 Two.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
warning: [options] bootstrap class path not set in conjunction with -source 1.3
warning: [options] source value 1.3 is obsolete and will be removed in a future release
warning: [options] target value 1.4 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
Two.java:3: warning: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
		assert(false);
		^
  (use -source 1.4 or higher to use 'assert' as a keyword)
Two.java:3: error: cannot find symbol
		assert(false);
		^
  symbol:   method assert(boolean)
  location: class Two
1 error
5 warnings


jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter7$ javac -source 1.4 Two.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
warning: [options] bootstrap class path not set in conjunction with -source 1.4
warning: [options] source value 1.4 is obsolete and will be removed in a future release
warning: [options] target value 1.4 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
4 warnings

*/
