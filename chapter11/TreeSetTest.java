import java.util.*;
class TreeSetTest {
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		Set s = new TreeSet();
		
		ba[0] = s.add("a");
		ba[1] = s.add("z");//ba[5] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add("h");//ba[6] = s.add(new Object());
		for(int x = 0; x < ba.length; x++) {
			System.out.print(ba[x] + "  ");
		}
		System.out.println();
		for(Object o : s)
			System.out.print(o + "  ");
	}
} 

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java TreeSetTest
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
true  true  true  false  true  
a  b  h  z  


if uncommented the code

Exception in thread "main" java.lang.ClassCastException: java.lang.
String
        at java.lang.Integer.compareTo(Integer.java:35)
        at java.util.TreeMap.compare(TreeMap.java:1093)
        at java.util.TreeMap.put(TreeMap.java:465)
        at java.util.TreeSet.add(TreeSet.java:210)
The issue is that whenever you want a collection to be sorted, its elements must be mutually comparable. Remember that unless otherwise specified, objects of different types are not mutually comparable

*/
