import java.util.*;
public class Ferry {
  public static void main(String[] args) {
    TreeSet<Integer> times = new TreeSet<Integer>();
    times.add(1205);   
    times.add(1505);
    times.add(1545);
    times.add(1830);
    times.add(2010);
    times.add(2100);
    // Java 5 version
    TreeSet<Integer> subset = new TreeSet<Integer>();
    subset = (TreeSet)times.headSet(1600);
    System.out.println("J5 - last before 4pm is: " + subset.last());
    TreeSet<Integer> sub2 = new TreeSet<Integer>();
    sub2 = (TreeSet)times.tailSet(2000);
    System.out.println("J5 - first after 8pm is: " + sub2.first());
    // Java 6 version using the new lower() and higher() methods
    System.out.println("J6 - last before 4pm is: " + times.lower(1600));
    System.out.println("J6 - first after 8pm is: " + times.higher(2000));
  }
}

/*
jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java Ferry
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
J5 - last before 4pm is: 1545
J5 - first after 8pm is: 2010
J6 - last before 4pm is: 1545
J6 - first after 8pm is: 2010

*/
