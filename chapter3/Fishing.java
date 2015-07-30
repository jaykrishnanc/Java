public class Fishing {
	byte b1 = 4;
	int i1 = 123456;
	long L1 = (long)i1;
	short s2 = (short)i1;
	byte b2 = (byte)i1;
	int i2 = (int)123.456;
	byte b3 = b1 + 7;
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter3$ javac Fishing.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Fishing.java:8: error: incompatible types: possible lossy conversion from int to byte
	byte b3 = b1 + 7;
	             ^
1 error




*/
