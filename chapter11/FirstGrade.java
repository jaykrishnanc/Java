import java.util.*;
class Dog { int size; Dog(int s) { size = s; } }
public class FirstGrade {
   public static void main(String[] args) {
     TreeSet<Integer> i = new TreeSet<Integer>();
     TreeSet<Dog> d = new TreeSet<Dog>();

     d.add(new Dog(1));  d.add(new Dog(2));  d.add(new Dog(1));
     i.add(1);  i.add(2);  i.add(1);
     System.out.println(d.size() + " " + i.size());
   }
}


/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ javac FirstGrade.java
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java FirstGrade
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
Exception in thread "main" java.lang.ClassCastException: Dog cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1290)
	at java.util.TreeMap.put(TreeMap.java:538)
	at java.util.TreeSet.add(TreeSet.java:255)
	at FirstGrade.main(FirstGrade.java:8)


*/
