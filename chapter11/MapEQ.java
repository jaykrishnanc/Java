import java.util.*;
class MapEQ {
	public static void main(String[] args) {
		Map<ToDos, String> m = new HashMap<ToDos, String>();
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Monday");
		ToDos t3 = new ToDos("TuesDay");
		m.put(t1, "doLaundry");
		m.put(t2, "payBills");
		m.put(t3, "cleanAttic");
		System.out.println(m.size());
	}
}
class ToDos {
	String day;
	ToDos(String d) {day = d;}
	public boolean equals(Object o) {
		return ((ToDos)o).day.equals(this.day);
	}
	public int hashCode() { return 9;}
}

/*
*************commented public int hashCode() { return 9;}**********

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ javac MapEQ.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java MapEQ
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
3

*************uncommented public int hashCode() { return 9;}**********

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ javac MapEQ.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java MapEQPicked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
2

*/
